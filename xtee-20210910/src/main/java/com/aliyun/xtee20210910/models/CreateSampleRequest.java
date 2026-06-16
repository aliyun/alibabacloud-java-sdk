// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the file uploaded by the OSS client.</p>
     * 
     * <strong>example:</strong>
     * <p>样本文件.csv</p>
     */
    @NameInMap("clientFileName")
    public String clientFileName;

    /**
     * <p>The OSS client address.</p>
     * 
     * <strong>example:</strong>
     * <p>sample/path</p>
     */
    @NameInMap("clientPath")
    public String clientPath;

    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("fileType")
    public String fileType;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The label of the data sample.</p>
     * 
     * <strong>example:</strong>
     * <p>rm0102</p>
     */
    @NameInMap("sampleTag")
    public String sampleTag;

    /**
     * <p>The type of the data sample.</p>
     * 
     * <strong>example:</strong>
     * <p>PHONE</p>
     */
    @NameInMap("sampleType")
    public String sampleType;

    /**
     * <p>The values of the data sample.</p>
     * 
     * <strong>example:</strong>
     * <p>1777000000,1777000001</p>
     */
    @NameInMap("sampleValues")
    public String sampleValues;

    /**
     * <p>The upload type.</p>
     * 
     * <strong>example:</strong>
     * <p>ANNEX</p>
     */
    @NameInMap("uploadType")
    public String uploadType;

    public static CreateSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSampleRequest self = new CreateSampleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSampleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateSampleRequest setClientFileName(String clientFileName) {
        this.clientFileName = clientFileName;
        return this;
    }
    public String getClientFileName() {
        return this.clientFileName;
    }

    public CreateSampleRequest setClientPath(String clientPath) {
        this.clientPath = clientPath;
        return this;
    }
    public String getClientPath() {
        return this.clientPath;
    }

    public CreateSampleRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreateSampleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateSampleRequest setSampleTag(String sampleTag) {
        this.sampleTag = sampleTag;
        return this;
    }
    public String getSampleTag() {
        return this.sampleTag;
    }

    public CreateSampleRequest setSampleType(String sampleType) {
        this.sampleType = sampleType;
        return this;
    }
    public String getSampleType() {
        return this.sampleType;
    }

    public CreateSampleRequest setSampleValues(String sampleValues) {
        this.sampleValues = sampleValues;
        return this;
    }
    public String getSampleValues() {
        return this.sampleValues;
    }

    public CreateSampleRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
