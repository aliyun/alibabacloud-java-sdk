// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadForeignSampleFileAdvanceRequest extends TeaModel {
    /**
     * <p>OSS path of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/cpoc/953c883cde33b2e21d722eb661d26375/1779172027996_自动回溯测试 2605191.csv</p>
     */
    @NameInMap("File")
    public java.io.InputStream fileObject;

    /**
     * <p>Set the language type for requests and received messages. The default value is <strong>zh</strong>. Valid values:</p>
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
     * <p>area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>FINANCE</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static UploadForeignSampleFileAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadForeignSampleFileAdvanceRequest self = new UploadForeignSampleFileAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UploadForeignSampleFileAdvanceRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public UploadForeignSampleFileAdvanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadForeignSampleFileAdvanceRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UploadForeignSampleFileAdvanceRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
