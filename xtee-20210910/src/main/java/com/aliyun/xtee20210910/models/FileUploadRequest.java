// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class FileUploadRequest extends TeaModel {
    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>P4911_2707.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://res-v1.cupl-fdfs.com/direct/79886bdc-9855-4ff4-aa34-eb5b21cd43a7">https://res-v1.cupl-fdfs.com/direct/79886bdc-9855-4ff4-aa34-eb5b21cd43a7</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>FNNCIEA</p>
     */
    @NameInMap("Tab")
    public String tab;

    public static FileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        FileUploadRequest self = new FileUploadRequest();
        return TeaModel.build(map, self);
    }

    public FileUploadRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public FileUploadRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public FileUploadRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FileUploadRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

}
