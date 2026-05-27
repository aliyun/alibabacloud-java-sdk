// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateForeignPocSampleAdvanceRequest extends TeaModel {
    @NameInMap("File")
    public java.io.InputStream fileObject;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <strong>example:</strong>
     * <p>nemo-test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>SampleNameTest</p>
     */
    @NameInMap("SampleName")
    public String sampleName;

    /**
     * <strong>example:</strong>
     * <p>FINANCE</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static CreateForeignPocSampleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForeignPocSampleAdvanceRequest self = new CreateForeignPocSampleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateForeignPocSampleAdvanceRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateForeignPocSampleAdvanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateForeignPocSampleAdvanceRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateForeignPocSampleAdvanceRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateForeignPocSampleAdvanceRequest setSampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }
    public String getSampleName() {
        return this.sampleName;
    }

    public CreateForeignPocSampleAdvanceRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
