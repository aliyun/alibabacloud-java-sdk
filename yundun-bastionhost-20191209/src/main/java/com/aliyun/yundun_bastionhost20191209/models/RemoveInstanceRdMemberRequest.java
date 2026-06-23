// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RemoveInstanceRdMemberRequest extends TeaModel {
    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the RD member account to remove.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1597141696147832</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about regions and zones, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RemoveInstanceRdMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceRdMemberRequest self = new RemoveInstanceRdMemberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceRdMemberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveInstanceRdMemberRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public RemoveInstanceRdMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
