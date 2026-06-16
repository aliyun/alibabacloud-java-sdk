// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocSampleRequest extends TeaModel {
    /**
     * <p>File Name.</p>
     * 
     * <strong>example:</strong>
     * <p>P4911_2707.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>File URL.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/cpoc/953c883cde33b2e21d722eb661d26375/测试文件模板-通用.csv</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The language of the error message returned by the API. Valid values: zh: Chinese. en: English. The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>The remark for the topic. It can only contain letters, digits, underscores (_), and hyphens (-). The length must be 3 to 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-pub</p>
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
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <p>Access type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePocSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePocSampleRequest self = new CreatePocSampleRequest();
        return TeaModel.build(map, self);
    }

    public CreatePocSampleRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePocSampleRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreatePocSampleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePocSampleRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreatePocSampleRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePocSampleRequest setSampleName(String sampleName) {
        this.sampleName = sampleName;
        return this;
    }
    public String getSampleName() {
        return this.sampleName;
    }

    public CreatePocSampleRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public CreatePocSampleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
