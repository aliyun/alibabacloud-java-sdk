// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vendors")
    public java.util.List<ListInstanceCatalogResponseBodyVendors> vendors;

    public static ListInstanceCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceCatalogResponseBody self = new ListInstanceCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceCatalogResponseBody setVendors(java.util.List<ListInstanceCatalogResponseBodyVendors> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<ListInstanceCatalogResponseBodyVendors> getVendors() {
        return this.vendors;
    }

    public static class ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes self = new ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes();
            return TeaModel.build(map, self);
        }

        public ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstanceCatalogResponseBodyVendorsInstanceTypes extends TeaModel {
        @NameInMap("InstanceSubTypes")
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes> instanceSubTypes;

        @NameInMap("Name")
        public String name;

        public static ListInstanceCatalogResponseBodyVendorsInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceCatalogResponseBodyVendorsInstanceTypes self = new ListInstanceCatalogResponseBodyVendorsInstanceTypes();
            return TeaModel.build(map, self);
        }

        public ListInstanceCatalogResponseBodyVendorsInstanceTypes setInstanceSubTypes(java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes> instanceSubTypes) {
            this.instanceSubTypes = instanceSubTypes;
            return this;
        }
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes> getInstanceSubTypes() {
            return this.instanceSubTypes;
        }

        public ListInstanceCatalogResponseBodyVendorsInstanceTypes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListInstanceCatalogResponseBodyVendors extends TeaModel {
        @NameInMap("InstanceTypes")
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypes> instanceTypes;

        @NameInMap("Name")
        public String name;

        public static ListInstanceCatalogResponseBodyVendors build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceCatalogResponseBodyVendors self = new ListInstanceCatalogResponseBodyVendors();
            return TeaModel.build(map, self);
        }

        public ListInstanceCatalogResponseBodyVendors setInstanceTypes(java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypes> instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypes> getInstanceTypes() {
            return this.instanceTypes;
        }

        public ListInstanceCatalogResponseBodyVendors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
