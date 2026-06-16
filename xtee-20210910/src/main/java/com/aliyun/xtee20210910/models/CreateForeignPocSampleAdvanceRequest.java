// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateForeignPocSampleAdvanceRequest extends TeaModel {
    /**
     * <p>OSS path of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/cpoc/953c883cde33b2e21d722eb661d26375/1779172027996_自动回溯测试 2605191.csv</p>
     */
    @NameInMap("File")
    public java.io.InputStream fileObject;

    /**
     * <p>Set the language type for requests and received messages. Default value is <strong>zh</strong>. Valid values:</p>
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
     * <p>Area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>nemo-test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Sample Name.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleNameTest</p>
     */
    @NameInMap("SampleName")
    public String sampleName;

    /**
     * <p>Scenario.</p>
     * 
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
