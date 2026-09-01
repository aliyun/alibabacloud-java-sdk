// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketRequest extends TeaModel {
    /**
     * <p>The bucket name.</p>
     * 
     * <strong>example:</strong>
     * <p>iboxpublic****</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The language type for requests and responses. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The business source. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS</li>
     * <li><strong>NAS</strong>: NAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListOssBucketRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketRequest self = new ListOssBucketRequest();
        return TeaModel.build(map, self);
    }

    public ListOssBucketRequest setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ListOssBucketRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListOssBucketRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
