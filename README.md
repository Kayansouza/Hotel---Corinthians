# 🏨 Hotel Corinthians

Sistema de gestão hoteleira moderno desenvolvido com **Kotlin + Spring Boot**, focado em organização backend, APIs REST, reservas, precificação dinâmica e futuras integrações com aplicações web e mobile.

---

## 🚀 Sobre o Projeto

O **Hotel Corinthians** nasceu com o objetivo de centralizar e modernizar a gestão de um sistema hoteleiro completo.

O projeto está sendo desenvolvido pensando em uma arquitetura escalável capaz de gerenciar:

- hóspedes
- quartos
- reservas
- hospedagens
- pagamentos
- avaliações
- serviços internos

Além disso, o sistema foi estruturado visando futuras integrações com aplicações **web**, **mobile** e APIs externas.

---

## 🧠 Arquitetura do Sistema

O projeto utiliza uma arquitetura backend baseada em:

- Kotlin
- Spring Boot
- REST APIs
- Spring Data JPA
- Repository Pattern
- DTOs
- Services
- Controllers
- Segurança com JWT em estrutura inicial

A organização atual segue uma separação por camadas:

```txt
src/main/kotlin/
│
├── controller/
├── service/
├── repository/
├── dto/
├── model/
├── security/
├── config/
└── utils/
