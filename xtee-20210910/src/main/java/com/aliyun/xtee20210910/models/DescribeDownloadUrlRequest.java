// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlRequest extends TeaModel {
    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("FileType")
    public String fileType;

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
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18191</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The download type.</p>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadUrlRequest self = new DescribeDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadUrlRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public DescribeDownloadUrlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDownloadUrlRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeDownloadUrlRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeDownloadUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
