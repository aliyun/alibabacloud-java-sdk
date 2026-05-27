// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadForeignSampleFileRequest extends TeaModel {
    @NameInMap("File")
    public String file;

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

    public static UploadForeignSampleFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadForeignSampleFileRequest self = new UploadForeignSampleFileRequest();
        return TeaModel.build(map, self);
    }

    public UploadForeignSampleFileRequest setFile(String file) {
        this.file = file;
        return this;
    }
    public String getFile() {
        return this.file;
    }

    public UploadForeignSampleFileRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadForeignSampleFileRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public UploadForeignSampleFileRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
