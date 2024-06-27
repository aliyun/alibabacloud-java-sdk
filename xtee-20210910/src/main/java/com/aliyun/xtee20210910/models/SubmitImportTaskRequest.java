// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SubmitImportTaskRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("fileName")
    public String fileName;

    @NameInMap("regId")
    public String regId;

    @NameInMap("url")
    public String url;

    public static SubmitImportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportTaskRequest self = new SubmitImportTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitImportTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SubmitImportTaskRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public SubmitImportTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public SubmitImportTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
