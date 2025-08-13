// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDownloadUrlRequest extends TeaModel {
    /**
     * <p>File type</p>
     * 
     * <strong>example:</strong>
     * <p>CSV</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>18191</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>Download type</p>
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
