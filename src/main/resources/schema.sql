CREATE TABLE CUSTOMER (
                          CUSTOMER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
                          NAME VARCHAR(255) NOT NULL,
                          EMAIL VARCHAR(255) UNIQUE,
                          MOBILE_NUMBER VARCHAR(20),
                          CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          CREATED_BY VARCHAR(100),
                          UPDATED_AT TIMESTAMP,
                          UPDATED_BY VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS accounts (
                                        customer_id     INT NOT NULL,
                                        account_number  INT AUTO_INCREMENT PRIMARY KEY,
                                        account_type    VARCHAR(100) NOT NULL,
    branch_address  VARCHAR(200) NOT NULL,
    created_at      DATE NOT NULL,
    created_by      VARCHAR(20) NOT NULL,
    updated_at      DATE DEFAULT NULL,
    updated_by      VARCHAR(20) DEFAULT NULL
    );
