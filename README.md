# School Management System with Razorpay Payment Gateway Integration

## Project Overview
This project is a comprehensive School Management System built with a Java-based web application and enhanced with a secure and seamless payment integration using the Razorpay Payment Gateway. The backend for the payment integration is implemented using Spring Boot.

## Key Features
- Student, Teacher, and Admin Management
- Attendance and Grade Management
- Fee Management with Razorpay Payment Integration
- Dynamic Dashboard and Reporting

## Tech Stack
- **Frontend:** HTML, CSS, JavaScript, JSP
- **Backend:** Java, Spring Boot
- **Payment Gateway:** Razorpay
- **Database:** MySQL
- **Build Tool:** Maven

## Prerequisites
- JDK 11+
- Maven
- MySQL
- Razorpay Account

## Setup Instructions
1. **Clone the repository:**
```bash
git clone https://github.com/BharatBhagyajyoti/School-Management-System-JAVAwebApp.git
cd School-Management-System-JAVAwebApp
```

2. **Configure Database:**
- Set up MySQL database and update `application.properties` with your credentials.

3. **Install Dependencies:**
```bash
mvn clean install
```

4. **Configure Razorpay:**
- Get API Key and Secret from Razorpay.
- Update the configuration in `application.properties`:
```properties
razorpay.key=YOUR_KEY_HERE
razorpay.secret=YOUR_SECRET_HERE
```

5. **Run the Application:**
```bash
mvn spring-boot:run
```

6. **Access the Application:**
Open `http://localhost:8080` in your browser.

## Usage
- Navigate to the fee management section to initiate a payment.
- Test payments using Razorpay’s sandbox mode.

## Contributing
Contributions are welcome! Please fork the repository and create a pull request.




