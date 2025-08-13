// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadFileCheckRequest extends TeaModel {
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
     * <p>Sample type</p>
     * 
     * <strong>example:</strong>
     * <p>白名单</p>
     */
    @NameInMap("sampleTagType")
    public String sampleTagType;

    /**
     * <p>Service list</p>
     * 
     * <strong>example:</strong>
     * <p>account_abuse</p>
     */
    @NameInMap("serviceList")
    public String serviceList;

    public static UploadFileCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileCheckRequest self = new UploadFileCheckRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileCheckRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadFileCheckRequest setBatchName(String batchName) {
        this.batchName = batchName;
        return this;
    }
    public String getBatchName() {
        return this.batchName;
    }

    public UploadFileCheckRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public UploadFileCheckRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public UploadFileCheckRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UploadFileCheckRequest setSampleTagType(String sampleTagType) {
        this.sampleTagType = sampleTagType;
        return this;
    }
    public String getSampleTagType() {
        return this.sampleTagType;
    }

    public UploadFileCheckRequest setServiceList(String serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public String getServiceList() {
        return this.serviceList;
    }

}
