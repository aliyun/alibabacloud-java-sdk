// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionResourceTypeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypeList")
    public java.util.List<ListNisInspectionResourceTypeResponseBodyResourceTypeList> resourceTypeList;

    public static ListNisInspectionResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionResourceTypeResponseBody self = new ListNisInspectionResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNisInspectionResourceTypeResponseBody setResourceTypeList(java.util.List<ListNisInspectionResourceTypeResponseBodyResourceTypeList> resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }
    public java.util.List<ListNisInspectionResourceTypeResponseBodyResourceTypeList> getResourceTypeList() {
        return this.resourceTypeList;
    }

    public static class ListNisInspectionResourceTypeResponseBodyResourceTypeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListNisInspectionResourceTypeResponseBodyResourceTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListNisInspectionResourceTypeResponseBodyResourceTypeList self = new ListNisInspectionResourceTypeResponseBodyResourceTypeList();
            return TeaModel.build(map, self);
        }

        public ListNisInspectionResourceTypeResponseBodyResourceTypeList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
