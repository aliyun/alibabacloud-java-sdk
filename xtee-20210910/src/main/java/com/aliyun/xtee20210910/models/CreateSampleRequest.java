// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateSampleRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("clientFileName")
    public String clientFileName;

    @NameInMap("clientPath")
    public String clientPath;

    @NameInMap("fileType")
    public String fileType;

    @NameInMap("regId")
    public String regId;

    @NameInMap("sampleTag")
    public String sampleTag;

    @NameInMap("sampleType")
    public String sampleType;

    @NameInMap("sampleValues")
    public String sampleValues;

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
