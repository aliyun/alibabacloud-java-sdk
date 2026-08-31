// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ResourceRecord extends TeaModel {
    /**
     * <p>The record creation time, a UNIX timestamp in seconds. This field is returned only in responses.</p>
     * 
     * <strong>example:</strong>
     * <p>1787800000</p>
     */
    @NameInMap("createTime")
    public Long createTime;

    /**
     * <p>The record ID. If this field is not specified during creation or batch write, the server automatically generates it. If specified, the provided ID is used.</p>
     * 
     * <strong>example:</strong>
     * <p>record-001</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The record last modification time, a UNIX timestamp in seconds. This field is returned only in responses.</p>
     * 
     * <strong>example:</strong>
     * <p>1787803600</p>
     */
    @NameInMap("lastModifyTime")
    public Long lastModifyTime;

    /**
     * <p>The record tag.</p>
     * 
     * <strong>example:</strong>
     * <p>production</p>
     */
    @NameInMap("tag")
    public String tag;

    /**
     * <p>The record content, which is a string encoded from a JSON object.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("value")
    public String value;

    public static ResourceRecord build(java.util.Map<String, ?> map) throws Exception {
        ResourceRecord self = new ResourceRecord();
        return TeaModel.build(map, self);
    }

    public ResourceRecord setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ResourceRecord setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ResourceRecord setLastModifyTime(Long lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
        return this;
    }
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    public ResourceRecord setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ResourceRecord setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
