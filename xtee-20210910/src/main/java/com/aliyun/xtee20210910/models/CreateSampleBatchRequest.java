// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleBatchRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, with a default value of <strong>zh</strong>. Values:</p>
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
     * <p>Sample batch name</p>
     * 
     * <strong>example:</strong>
     * <p>白样本</p>
     */
    @NameInMap("batchName")
    public String batchName;

    /**
     * <p>Data type</p>
     * 
     * <strong>example:</strong>
     * <p>mobile</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>Content of the list entered in the text box</p>
     * 
     * <strong>example:</strong>
     * <p>1770000000,1770000001</p>
     */
    @NameInMap("dataValue")
    public String dataValue;

    /**
     * <p>Description information.</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Uploaded OSS address.</p>
     * 
     * <strong>example:</strong>
     * <p>sample/94b4193d321c44b44ee92b19984000a0/样本测试01/0d8dbc6809834d51b1d88a42295c803e/1753865835166.csv</p>
     */
    @NameInMap("ossFileName")
    public String ossFileName;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Specific type of sample list</p>
     * 
     * <strong>example:</strong>
     * <p>白名单</p>
     */
    @NameInMap("sampleBatchType")
    public String sampleBatchType;

    /**
     * <p>Service list</p>
     * 
     * <strong>example:</strong>
     * <p>account_takeover</p>
     */
    @NameInMap("serviceList")
    public String serviceList;

    public static CreateSampleBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleBatchRequest self = new CreateSampleBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleBatchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSampleBatchRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public CreateSampleBatchRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateSampleBatchRequest setDataValue(String dataValue) {
        this.dataValue = dataValue;
        return this;
    }
    public String getDataValue() {
        return this.dataValue;
    }

    public CreateSampleBatchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSampleBatchRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public CreateSampleBatchRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSampleBatchRequest setSampleBatchType(String sampleBatchType) {
        this.sampleBatchType = sampleBatchType;
        return this;
    }
    public String getSampleBatchType() {
        return this.sampleBatchType;
    }

    public CreateSampleBatchRequest setServiceList(String serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public String getServiceList() {
        return this.serviceList;
    }

}
