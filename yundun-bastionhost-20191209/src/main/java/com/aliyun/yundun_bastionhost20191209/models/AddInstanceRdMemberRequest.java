// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AddInstanceRdMemberRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2ve7h00a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the RD member account to add.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1857311509574932</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddInstanceRdMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddInstanceRdMemberRequest self = new AddInstanceRdMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddInstanceRdMemberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddInstanceRdMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public AddInstanceRdMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
