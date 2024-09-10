// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>资源目录成员账号主账号ID。</p>
     * <blockquote>
     * <p>调用<a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a>接口可以获取该参数。</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The UUIDs of the ECS instances. Separate multiple UUIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0687b17f-2a36-4e5****,0687b17f-2a36-4e****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeAssetDetailByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsRequest self = new DescribeAssetDetailByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetDetailByUuidsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeAssetDetailByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
