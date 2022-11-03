// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkGetItemInstListRequest extends TeaModel {
    @NameInMap("ChannelCode")
    public String channelCode;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ItemCode")
    public String itemCode;

    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("OutBizNo")
    public String outBizNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UId")
    public Long UId;

    public static SdkGetItemInstListRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGetItemInstListRequest self = new SdkGetItemInstListRequest();
        return TeaModel.build(map, self);
    }

    public SdkGetItemInstListRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public SdkGetItemInstListRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public SdkGetItemInstListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SdkGetItemInstListRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public SdkGetItemInstListRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SdkGetItemInstListRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public SdkGetItemInstListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SdkGetItemInstListRequest setUId(Long UId) {
        this.UId = UId;
        return this;
    }
    public Long getUId() {
        return this.UId;
    }

}
