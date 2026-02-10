// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRegionResponseBody extends TeaModel {
    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("RegionList")
    public java.util.List<String> regionList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the regions.</p>
     */
    @NameInMap("VendorRegionList")
    public java.util.List<ListAgentlessRegionResponseBodyVendorRegionList> vendorRegionList;

    public static ListAgentlessRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRegionResponseBody self = new ListAgentlessRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRegionResponseBody setRegionList(java.util.List<String> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    public ListAgentlessRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentlessRegionResponseBody setVendorRegionList(java.util.List<ListAgentlessRegionResponseBodyVendorRegionList> vendorRegionList) {
        this.vendorRegionList = vendorRegionList;
        return this;
    }
    public java.util.List<ListAgentlessRegionResponseBodyVendorRegionList> getVendorRegionList() {
        return this.vendorRegionList;
    }

    public static class ListAgentlessRegionResponseBodyVendorRegionList extends TeaModel {
        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the server. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud</li>
         * <li><strong>3</strong>: Tencent Cloud</li>
         * <li><strong>4</strong>: Huawei Cloud</li>
         * <li><strong>5</strong>: Azure</li>
         * <li><strong>7</strong>: AWS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static ListAgentlessRegionResponseBodyVendorRegionList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRegionResponseBodyVendorRegionList self = new ListAgentlessRegionResponseBodyVendorRegionList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRegionResponseBodyVendorRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAgentlessRegionResponseBodyVendorRegionList setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
