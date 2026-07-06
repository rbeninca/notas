# Montando imagem 
# Para listar os dispositivos de armazenamento conectados ao sistema.
lsblk -o NAME,SIZE,MODEL,TRAN,MOUNTPOINTS

## Resultado esperado:
NAME          SIZE MODEL                       TRAN   MOUNTPOINTS
sda             0B Storage Device              usb    
sdb          14,8G Storage Device              usb    
├─sdb1        512M                                    /run/media/rbeninca/armbi_boot
└─sdb2       14,2G                                    
zram0           8G                                    [SWAP]
nvme1n1     476,9G KINGSTON RBUSNS8154P3512GJ1 nvme   
├─nvme1n1p1    16M                             nvme   
├─nvme1n1p2   100M                             nvme   
├─nvme1n1p3   476G                             nvme   
└─nvme1n1p4   807M                             nvme   
nvme0n1     953,9G XPG GAMMIX S11L             nvme   
├─nvme0n1p1   1,9G                             nvme   /boot/efi
├─nvme0n1p2   100M                             nvme   
├─nvme0n1p3   100M                             nvme   
├─nvme0n1p4   100M                             nvme   
├─nvme0n1p5  32,5G                             nvme   [SWAP]
├─nvme0n1p6     2G                             nvme   
└─nvme0n1p7 915,5G                             nvme   /home
                                                      /



#Demonatar partições de um dispositivo de armazenamento.
#Para desmontar uma partição, você pode usar o comando `umount` seguido do caminho do ponto de montagem da partição que deseja desmontar. Por exemplo, se você deseja desmontar a partição `/mnt/ssd`, você pode executar o seguinte comando:

sudo umount /dev/sdb1 2>/dev/null
sudo umount /dev/sdb2 2>/dev/null


#criar partições em um dispositivo de armazenamento.
#Para criar partições em um dispositivo de armazenamento, você pode usar o comando `fdisk`. Aqui está um exemplo de como criar partições em um dispositivo de armazenamento, como `/dev/sda`. Lembre-se de substituir `/dev/sda` pelo caminho correto do seu dispositivo de armazenamento


sudo dd if=/dev/sdb of=tx9-pro-armbian.img bs=4M status=progress conv=fsync
sync




#removendos espaços vazios do arquivo de imagem
#Para remover espaços vazios do arquivo de imagem, você pode usar o comando `pishrink.sh`. Aqui está um exemplo de como usar o comando `pishrink.sh` para reduzir o tamanho do arquivo de imagem `tx9-pro-armbian.img` e criar um novo arquivo de imagem chamado `tx9-pro-armbian-reduzido.img`:

Instalaçõ de dependências necessárias para o pishrink.sh no fedora  43 
```bash 
sudo dnf install -y wget parted gzip pigz xz e2fsprogs util-linux zstd
```
```
wget https://raw.githubusercontent.com/Drewsif/PiShrink/master/pishrink.sh
chmod +x pishrink.sh
sudo mv pishrink.sh /usr/local/bin/pishrink

sudo pishrink -v tx9-pro-armbian.img  tx9-pro-armbian-reduzido.img 
