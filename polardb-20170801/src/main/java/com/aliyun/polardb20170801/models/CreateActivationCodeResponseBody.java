// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateActivationCodeResponseBody extends TeaModel {
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
     * <p>4CE6DF97-AEA4-484F-906F-C407EE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("SystemIdentifier")
    public String systemIdentifier;

    public static CreateActivationCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationCodeResponseBody self = new CreateActivationCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateActivationCodeResponseBody setActivateAt(String activateAt) {
        this.activateAt = activateAt;
        return this;
    }
    public String getActivateAt() {
        return this.activateAt;
    }

    public CreateActivationCodeResponseBody setCertContentB64(String certContentB64) {
        this.certContentB64 = certContentB64;
        return this;
    }
    public String getCertContentB64() {
        return this.certContentB64;
    }

    public CreateActivationCodeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateActivationCodeResponseBody setExpireAt(String expireAt) {
        this.expireAt = expireAt;
        return this;
    }
    public String getExpireAt() {
        return this.expireAt;
    }

    public CreateActivationCodeResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CreateActivationCodeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public CreateActivationCodeResponseBody setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public CreateActivationCodeResponseBody setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public CreateActivationCodeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateActivationCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateActivationCodeResponseBody setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
        return this;
    }
    public String getSystemIdentifier() {
        return this.systemIdentifier;
    }

}
