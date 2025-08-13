// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleDataRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Encryption type</p>
     * 
     * <strong>example:</strong>
     * <p>LABEL</p>
     */
    @NameInMap("encryptType")
    public String encryptType;

    /**
     * <p>Name</p>
     * 
     * <strong>example:</strong>
     * <p>注册样本</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Specified risk value</p>
     * 
     * <strong>example:</strong>
     * <p>black</p>
     */
    @NameInMap("riskValue")
    public String riskValue;

    /**
     * <p>Scene</p>
     * 
     * <strong>example:</strong>
     * <p>PHONE</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>Storage path</p>
     * 
     * <strong>example:</strong>
     * <p>saf/de/sample/3dc2spspHKq4G3YI9d08</p>
     */
    @NameInMap("storePath")
    public String storePath;

    /**
     * <p>Storage type</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("storeType")
    public String storeType;

    public static CreateSampleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleDataRequest self = new CreateSampleDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSampleDataRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSampleDataRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public CreateSampleDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSampleDataRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSampleDataRequest setRiskValue(String riskValue) {
        this.riskValue = riskValue;
        return this;
    }
    public String getRiskValue() {
        return this.riskValue;
    }

    public CreateSampleDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateSampleDataRequest setStorePath(String storePath) {
        this.storePath = storePath;
        return this;
    }
    public String getStorePath() {
        return this.storePath;
    }

    public CreateSampleDataRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

}
