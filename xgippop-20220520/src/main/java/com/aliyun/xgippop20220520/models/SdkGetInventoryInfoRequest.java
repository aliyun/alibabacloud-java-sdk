// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkGetInventoryInfoRequest extends TeaModel {
    @NameInMap("ChannelCode")
    public String channelCode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemCode")
    public String itemCode;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("OutBizNo")
    public String outBizNo;

    @NameInMap("UId")
    public Long UId;

    public static SdkGetInventoryInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGetInventoryInfoRequest self = new SdkGetInventoryInfoRequest();
        return TeaModel.build(map, self);
    }

    public SdkGetInventoryInfoRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public SdkGetInventoryInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SdkGetInventoryInfoRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public SdkGetInventoryInfoRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SdkGetInventoryInfoRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SdkGetInventoryInfoRequest setUId(Long UId) {
        this.UId = UId;
        return this;
    }
    public Long getUId() {
        return this.UId;
    }

}
