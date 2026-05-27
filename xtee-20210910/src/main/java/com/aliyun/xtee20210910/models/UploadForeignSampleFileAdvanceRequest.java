// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadForeignSampleFileAdvanceRequest extends TeaModel {
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
