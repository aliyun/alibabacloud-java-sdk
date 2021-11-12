// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListVpcInfoByVpcRequest extends TeaModel {
    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TagInfo")
    public java.util.List<ListVpcInfoByVpcRequestTagInfo> tagInfo;

    @NameInMap("VpcId")
    public String vpcId;

    public static ListVpcInfoByVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByVpcRequest self = new ListVpcInfoByVpcRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByVpcRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListVpcInfoByVpcRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVpcInfoByVpcRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListVpcInfoByVpcRequest setTagInfo(java.util.List<ListVpcInfoByVpcRequestTagInfo> tagInfo) {
        this.tagInfo = tagInfo;
        return this;
    }
    public java.util.List<ListVpcInfoByVpcRequestTagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public ListVpcInfoByVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListVpcInfoByVpcRequestTagInfo extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static ListVpcInfoByVpcRequestTagInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVpcInfoByVpcRequestTagInfo self = new ListVpcInfoByVpcRequestTagInfo();
            return TeaModel.build(map, self);
        }

        public ListVpcInfoByVpcRequestTagInfo setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListVpcInfoByVpcRequestTagInfo setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
