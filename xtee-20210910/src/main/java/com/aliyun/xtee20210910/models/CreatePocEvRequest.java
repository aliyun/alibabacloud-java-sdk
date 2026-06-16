// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocEvRequest extends TeaModel {
    /**
     * <p>The date format type.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyyMMdd</p>
     */
    @NameInMap("DateFormat")
    public String dateFormat;

    /**
     * <p>The file name.</p>
     * <blockquote>
     * <p>The file name must end with txt or sql. Example: test.txt or test.sql.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The file URL.</p>
     * 
     * <strong>example:</strong>
     * <p>saf/cpoc/953c883cde33b2e21d722eb661d26375/测试文件模板-通用.csv</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>anti_fraud_v2</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The service name.</p>
     * 
     * <strong>example:</strong>
     * <p>注册风险</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>er-log-s3</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The access type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreatePocEvRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePocEvRequest self = new CreatePocEvRequest();
        return TeaModel.build(map, self);
    }

    public CreatePocEvRequest setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    public String getDateFormat() {
        return this.dateFormat;
    }

    public CreatePocEvRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreatePocEvRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public CreatePocEvRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreatePocEvRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePocEvRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreatePocEvRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public CreatePocEvRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreatePocEvRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public CreatePocEvRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreatePocEvRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
