<a href="https://www.tic.unam.mx/" target="_blank"><img aling="center" src="https://github.com/LanIkari/Preprocessing-DataCleansing-Python/assets/42923366/92475bdf-c1f3-4d72-9ae4-b1dc4bf08b27" alt="Banner"></img></a>
![JDK](https://img.shields.io/badge/JDK-17-3670A0?style=for-the-badge&logo=OpenJDK&logoColor=ffdd54)
![Maven](https://img.shields.io/badge/Maven-3.3.9-%23013243.svg?style=for-the-badge&logo=apachemaven&logoColor=white)
![intellijidea](https://img.shields.io/badge/intellijidea-2024-%23150458.svg?style=for-the-badge&logo=intellijidea&logoColor=white)
![git](https://img.shields.io/badge/git-2.44-%23F24E1E.svg?style=for-the-badge&logo=git&logoColor=white)
![Open_Source](https://img.shields.io/badge/Licence_MIT-%230072C6.svg?style=for-the-badge&logo=sourcehut&logoColor=white)
![Open_Source](https://img.shields.io/badge/Open_source-%23000000.svg?style=for-the-badge&logo=githubsponsors&logoColor=E71D29)


# 🖥️ Sistema Punto de Venta (SPV)

El Sistema de Punto de Venta está diseñado para facilitar y optimizar las operaciones de venta, la gestión de inventario, y los ingresos a almacén en una Jarcería o negocio parecido. Este sistema permitirá:

- Gestionar productos
- Realizar ventas
- Controlar inventario
- Generar tickets de venta
- Generar reporte de artículos
- Administrar la información de los clientes, proveedores y empleados

El sistema está orientado a mejorar la eficiencia operativa, reducir errores humanos y proporcionar una experiencia de usuario fluida y segura tanto para los empleados como para los clientes.
## 🔗 Diagrma E-R

[![E-R](https://mermaid.ink/img/pako:eNq9VlGP2jAM_itVn-_-AG8V153QGD0V2MOEVJnE9Kxr4ypNmTaO_76UtqJA4HraWB-gtT87_uzYyc4XLNEf-aifCFIN-Up59hkHi_A5iieBt2sE9UPKeCS9l69H0Ra0eAXtKc7XGi_lEkuhqRDE6qhck_FAGNpyI9s3f81vEC8m4-U0-mDhWjQGgylrgsQqvziistwo5Y-jlSgoh8wrtH3hZIvKwOlSpWHxNpBep7QuUxxKO46m_zrVJ_5fwngezYaW01DBSYG6ZAWfiIBs_ty5MJjhhpWjFpgDZQOTtJwvg3gS_WWioMAsI-mIRVS6uA-tTlxAWf5kLQcS_h7OFsGATmhLdd4HtaoqK9B2U19pEVXlieC80LwGZfo9YZvLUI7eBi3wslcMG3AQxNKAdFGZzJ7jcB7dhcya0lr737g8hYtgOg2T4ZxIpRpLdnECbUhUmVMnLA-SIK-NqhuxDd06h2F3n7j68no6VXYp5-wLp8F4Es2Str8TxzDsVf6cgeasL7auz8-w9_fHR94dj5aRt_INocKVf3botMjzAtcGgtUgmybxLotuBrcGR6BGyOg3XMH1gzhDdgPxwqPtAYHlNVzf422kszQX6auFnzLoAriR7hN8Q-xqolus_-DnqO3glfZCc9g_VvWKuVXVKAn6rXa4tzioDM9_KeGPjK7wwa-Keka0V6BOWID6wWw_N5CV9hslGdbfmgvT4d60_wNYeLks?type=png)](https://mermaid.live/edit#pako:eNq9VlGP2jAM_itVn-_-AG8V153QGD0V2MOEVJnE9Kxr4ypNmTaO_76UtqJA4HraWB-gtT87_uzYyc4XLNEf-aifCFIN-Up59hkHi_A5iieBt2sE9UPKeCS9l69H0Ra0eAXtKc7XGi_lEkuhqRDE6qhck_FAGNpyI9s3f81vEC8m4-U0-mDhWjQGgylrgsQqvziistwo5Y-jlSgoh8wrtH3hZIvKwOlSpWHxNpBep7QuUxxKO46m_zrVJ_5fwngezYaW01DBSYG6ZAWfiIBs_ty5MJjhhpWjFpgDZQOTtJwvg3gS_WWioMAsI-mIRVS6uA-tTlxAWf5kLQcS_h7OFsGATmhLdd4HtaoqK9B2U19pEVXlieC80LwGZfo9YZvLUI7eBi3wslcMG3AQxNKAdFGZzJ7jcB7dhcya0lr737g8hYtgOg2T4ZxIpRpLdnECbUhUmVMnLA-SIK-NqhuxDd06h2F3n7j68no6VXYp5-wLp8F4Es2Str8TxzDsVf6cgeasL7auz8-w9_fHR94dj5aRt_INocKVf3botMjzAtcGgtUgmybxLotuBrcGR6BGyOg3XMH1gzhDdgPxwqPtAYHlNVzf422kszQX6auFnzLoAriR7hN8Q-xqolus_-DnqO3glfZCc9g_VvWKuVXVKAn6rXa4tzioDM9_KeGPjK7wwa-Keka0V6BOWID6wWw_N5CV9hslGdbfmgvT4d60_wNYeLks)

## 🔐 Diagrama de Secuencia de Seguridad

[![Security](https://mermaid.ink/img/pako:eNqNVEtu2zAQvQrBVQLE6F4LA4GdFOgqqIsEKLSZkJN0UIp0yaEQJ8hheoYeIRfryPpYllSgWpHD997MvBH5pk2wqAud8FdGb3BL8ByhKr2Sbw-RydAePKuNI_Q8j19n_rEJnmNwDqOCdIwIlAwwBa9Oh8vkHcaaDC4wu5M5bQsMj5AWTr48fLslx20hslHtbg7cocmR-NBUhy_cwPuQ6mJz0l0MjIbRfsUUcmyLHoKqj5a-pbaWrdbrc48KtQtOJDlbZUUic9uzoY8_Xl2YiFYmQeAwXbZC5_xOsHOnUDe-JohqzDvROpRwetMKdY-RniThEqdHraZZNiOoqj9-O7KQPiny_XqecyrxGT1GydrM5SKRGoTC5T_JY9u2WAdX41Fg0RjhtJ4PpgzIbhYjxLWrwKBfAK3Xw280npWRX1IcgEd8BRu60YVIr_3khNU1MvBX52I3LxxBGjioGhrTRrlPlOl4O45FBteYb9GpnDJECv9l4yj_dkFjoeLJ5SjUHSRYrqBlTwgiMbsqxbGuo11N_3uMFTHJPTVGEKXXV7qSGJCV1-itkS21vAYVlrqQpXj1s9SlfxdcY_vu4I0uOGa80nlvgfuXqw_Khf0egmyfwCV8_wui073D?type=png)](https://mermaid.live/edit#pako:eNqNVEtu2zAQvQrBVQLE6F4LA4GdFOgqqIsEKLSZkJN0UIp0yaEQJ8hheoYeIRfryPpYllSgWpHD997MvBH5pk2wqAud8FdGb3BL8ByhKr2Sbw-RydAePKuNI_Q8j19n_rEJnmNwDqOCdIwIlAwwBa9Oh8vkHcaaDC4wu5M5bQsMj5AWTr48fLslx20hslHtbg7cocmR-NBUhy_cwPuQ6mJz0l0MjIbRfsUUcmyLHoKqj5a-pbaWrdbrc48KtQtOJDlbZUUic9uzoY8_Xl2YiFYmQeAwXbZC5_xOsHOnUDe-JohqzDvROpRwetMKdY-RniThEqdHraZZNiOoqj9-O7KQPiny_XqecyrxGT1GydrM5SKRGoTC5T_JY9u2WAdX41Fg0RjhtJ4PpgzIbhYjxLWrwKBfAK3Xw280npWRX1IcgEd8BRu60YVIr_3khNU1MvBX52I3LxxBGjioGhrTRrlPlOl4O45FBteYb9GpnDJECv9l4yj_dkFjoeLJ5SjUHSRYrqBlTwgiMbsqxbGuo11N_3uMFTHJPTVGEKXXV7qSGJCV1-itkS21vAYVlrqQpXj1s9SlfxdcY_vu4I0uOGa80nlvgfuXqw_Khf0egmyfwCV8_wui073D)

## 📽️ Video Demostrativo

[![Video](https://github.com/LanIkari/OOP-Python/assets/42923366/79f604aa-6472-4e2c-81dd-77208ff886ca)](https://youtu.be/1VGPvRjEXs0?si=Gt6FxodbWXvR4fuA)


## 🖋️ Autor

<p align="center">
  <a href="https://lanikari.github.io/BrandonAV-Portfolio/" target="_blank">
  <img width="100px" src="https://github-production-user-asset-6210df.s3.amazonaws.com/42923366/245333869-34be7609-805c-4b8a-9f72-21315cdaa13a.png" alt="Brandon-Portfolio" />
  </a>
  <br />
  <i><sub>Designed & Built by Brandon Avendaño Villegas</sub></i>
  <br>
  <b><sub>Crafted with ❤️</sub></b>
<p>

