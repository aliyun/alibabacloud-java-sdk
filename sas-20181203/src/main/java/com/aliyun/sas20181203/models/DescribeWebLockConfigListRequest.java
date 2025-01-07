// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockConfigListRequest extends TeaModel {
    /**
     * <p>The configuration ID of the protected directory.</p>
     * 
     * <strong>example:</strong>
     * <p>1404656</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.3.4</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-1234567****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeWebLockConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockConfigListRequest self = new DescribeWebLockConfigListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockConfigListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeWebLockConfigListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWebLockConfigListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWebLockConfigListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
