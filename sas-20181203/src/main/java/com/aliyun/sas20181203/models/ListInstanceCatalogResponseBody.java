// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListInstanceCatalogResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>0D42A83F-CE33-5F54-A5AE-05DA39F59E1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The asset types by service provider.</p>
     */
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
        /**
         * <p>The name of the asset subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>SECURITY_GROUP</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the asset subtype.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Value")
        public Integer value;

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

        public ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class ListInstanceCatalogResponseBodyVendorsInstanceTypes extends TeaModel {
        /**
         * <p>The asset subtypes.</p>
         */
        @NameInMap("InstanceSubTypes")
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypesInstanceSubTypes> instanceSubTypes;

        /**
         * <p>The name of the asset type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the asset type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS)</li>
         * <li><strong>1</strong>: Server Load Balancer (SLB)</li>
         * <li><strong>3</strong>: ApsaraDB RDS</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB (MongoDB)</li>
         * <li><strong>5</strong>: Tair (Redis OSS-compatible)</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: Container Service for Kubernetes (ACK)</li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC)</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: Alibaba Cloud CDN (CDN)</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Alibaba Cloud DevOps</li>
         * <li><strong>15</strong>: Resource Access Management (RAM)</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall (WAF)</li>
         * <li><strong>18</strong>: Object Storage Service (OSS)</li>
         * <li><strong>19</strong>: PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL</li>
         * <li><strong>21</strong>: Microservices Engine (MSE)</li>
         * <li><strong>22</strong>: Apsara File Storage NAS (NAS)</li>
         * <li><strong>23</strong>: Data Security Center (DSC)</li>
         * <li><strong>24</strong>: Elastic IP Address (EIP)</li>
         * <li><strong>25</strong>: Identity as a Service (IDaaS) - Enterprise Identity Access Management (EIAM)</li>
         * <li><strong>26</strong>: PolarDB for Xscale (PolarDB-X)</li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Value")
        public Integer value;

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

        public ListInstanceCatalogResponseBodyVendorsInstanceTypes setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

    public static class ListInstanceCatalogResponseBodyVendors extends TeaModel {
        /**
         * <p>The asset types.</p>
         */
        @NameInMap("InstanceTypes")
        public java.util.List<ListInstanceCatalogResponseBodyVendorsInstanceTypes> instanceTypes;

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the service provider type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: an asset provided by Alibaba Cloud</li>
         * <li><strong>1</strong>: an asset outside Alibaba Cloud</li>
         * <li><strong>2</strong>: an asset in a data center</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: an asset from a third-party cloud service provider</li>
         * <li><strong>8</strong>: a lightweight cloud asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Value")
        public Integer value;

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

        public ListInstanceCatalogResponseBodyVendors setValue(Integer value) {
            this.value = value;
            return this;
        }
        public Integer getValue() {
            return this.value;
        }

    }

}
