// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeActivationCodeDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2024-10-16 16:46:20</p>
     */
    @NameInMap("ActivateAt")
    public String activateAt;

    /**
     * <strong>example:</strong>
     * <p>AAEAA******AAA=</p>
     */
    @NameInMap("CertContentB64")
    public String certContentB64;

    /**
     * <strong>example:</strong>
     * <p>testCode</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2054-10-09 16:46:20</p>
     */
    @NameInMap("ExpireAt")
    public String expireAt;

    /**
     * <strong>example:</strong>
     * <p>2024-10-16 16:46:20</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <strong>example:</strong>
     * <p>2024-10-16 16:46:20</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <strong>example:</strong>
     * <p>12:34:56:78:98:00</p>
     */
    @NameInMap("MacAddress")
    public String macAddress;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F2A9EFA7-915F-4572-8299-85A307******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("SystemIdentifier")
    public String systemIdentifier;

    public static DescribeActivationCodeDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationCodeDetailsResponseBody self = new DescribeActivationCodeDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActivationCodeDetailsResponseBody setActivateAt(String activateAt) {
        this.activateAt = activateAt;
        return this;
    }
    public String getActivateAt() {
        return this.activateAt;
    }

    public DescribeActivationCodeDetailsResponseBody setCertContentB64(String certContentB64) {
        this.certContentB64 = certContentB64;
        return this;
    }
    public String getCertContentB64() {
        return this.certContentB64;
    }

    public DescribeActivationCodeDetailsResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeActivationCodeDetailsResponseBody setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public DescribeActivationCodeDetailsResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeActivationCodeDetailsResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeActivationCodeDetailsResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DescribeActivationCodeDetailsResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public DescribeActivationCodeDetailsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeActivationCodeDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActivationCodeDetailsResponseBody setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
        return this;
    }
    public String getSystemIdentifier() {
        return this.systemIdentifier;
    }

}
