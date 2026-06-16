// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeOssTokenRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The file name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.csv</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>The upload type.</p>
     * 
     * <strong>example:</strong>
     * <p>COMMUNITY_SAMPLE</p>
     */
    @NameInMap("uploadType")
    public String uploadType;

    public static DescribeOssTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssTokenRequest self = new DescribeOssTokenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOssTokenRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOssTokenRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DescribeOssTokenRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeOssTokenRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

}
