// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryRequest extends TeaModel {
    /**
     * <p>List of asset type information for cloud assets</p>
     */
    @NameInMap("CloudAssetTypes")
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes;

    /**
     * <p>List of cloud vendors to be queried.</p>
     */
    @NameInMap("Vendors")
    public java.util.List<Integer> vendors;

    public static GetCloudAssetSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryRequest self = new GetCloudAssetSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryRequest setCloudAssetTypes(java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> cloudAssetTypes) {
        this.cloudAssetTypes = cloudAssetTypes;
        return this;
    }
    public java.util.List<GetCloudAssetSummaryRequestCloudAssetTypes> getCloudAssetTypes() {
        return this.cloudAssetTypes;
    }

    public GetCloudAssetSummaryRequest setVendors(java.util.List<Integer> vendors) {
        this.vendors = vendors;
        return this;
    }
    public java.util.List<Integer> getVendors() {
        return this.vendors;
    }

    public static class GetCloudAssetSummaryRequestCloudAssetTypes extends TeaModel {
        /**
         * <p>云产品的子类型。
         * 资产的类型-子类型。取值：</p>
         * <ul>
         * <li><strong>0</strong>：云服务器 ECS <ul>
         * <li><strong>1</strong>：磁盘（存储）</li>
         * <li><strong>2</strong>：安全组</li>
         * <li><strong>100</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>1</strong>：负载均衡<ul>
         * <li><strong>0</strong>：负载均衡</li>
         * <li><strong>1</strong>：应用型负载均衡</li>
         * </ul>
         * </li>
         * <li><strong>3</strong>：云数据库 RDS<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>4</strong>：云数据库 MongoDB 版<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>5</strong>：云数据库 Tair（兼容 Redis）<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>6</strong>：容器镜像服务<ul>
         * <li><strong>1</strong>：企业版</li>
         * <li><strong>2</strong>：个人版</li>
         * </ul>
         * </li>
         * <li><strong>8</strong>：容器服务Kubernetes版<ul>
         * <li><strong>0</strong>：集群</li>
         * </ul>
         * </li>
         * <li><strong>9</strong>：专有网络VPC<ul>
         * <li><strong>0</strong>：NAT网关</li>
         * <li><strong>1</strong>：EIP</li>
         * <li><strong>2</strong>：VPN</li>
         * <li><strong>3</strong>：FLOW_LOG</li>
         * </ul>
         * </li>
         * <li><strong>11</strong>：操作审计<ul>
         * <li><strong>0</strong>：跟踪</li>
         * </ul>
         * </li>
         * <li><strong>12</strong>：CDN<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>13</strong>：数字证书管理服务（原SSL证书）<ul>
         * <li><strong>0</strong>：证书</li>
         * </ul>
         * </li>
         * <li><strong>14</strong>：云效<ul>
         * <li><strong>0</strong>：组织</li>
         * </ul>
         * </li>
         * <li><strong>16</strong>：DDoS防护<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>17</strong>：Web应用防火墙<ul>
         * <li><strong>0</strong>：域名</li>
         * </ul>
         * </li>
         * <li><strong>18</strong>：对象存储<ul>
         * <li><strong>0</strong>：Bucket</li>
         * </ul>
         * </li>
         * <li><strong>19</strong>：云原生关系型数据库 PolarDB<ul>
         * <li><strong>0</strong>：集群</li>
         * </ul>
         * </li>
         * <li><strong>20</strong>：云数据库 PostgreSQL 版<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>21</strong>：微服务引擎<ul>
         * <li><strong>0</strong>：集群</li>
         * </ul>
         * </li>
         * <li><strong>22</strong>：文件存储NAS<ul>
         * <li><strong>0</strong>：文件系统</li>
         * </ul>
         * </li>
         * <li><strong>23</strong>：数据安全中心<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>24</strong>：弹性公网IP<ul>
         * <li><strong>0</strong>：任播弹性公网IP</li>
         * </ul>
         * </li>
         * <li><strong>25</strong>：云身份服务-EIAM<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>26</strong>：PolarDB-X<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * <li><strong>27</strong>：Elasticsearch<ul>
         * <li><strong>0</strong>：实例</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>The type of asset. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Elastic Compute Service (ECS) </li>
         * <li><strong>1</strong>: Load Balancer </li>
         * <li><strong>3</strong>: ApsaraDB for RDS </li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB </li>
         * <li><strong>5</strong>: ApsaraDB for Tair (Redis compatible) </li>
         * <li><strong>6</strong>: Container Registry </li>
         * <li><strong>8</strong>: Container Service for Kubernetes </li>
         * <li><strong>9</strong>: Virtual Private Cloud (VPC) </li>
         * <li><strong>11</strong>: ActionTrail </li>
         * <li><strong>12</strong>: Content Delivery Network (CDN) </li>
         * <li><strong>13</strong>: SSL Certificates (now known as Certificate Management Service) </li>
         * <li><strong>14</strong>: DevOps </li>
         * <li><strong>16</strong>: DDoS Protection </li>
         * <li><strong>17</strong>: Web Application Firewall </li>
         * <li><strong>18</strong>: Object Storage Service (OSS) </li>
         * <li><strong>19</strong>: PolarDB </li>
         * <li><strong>20</strong>: ApsaraDB for PostgreSQL </li>
         * <li><strong>21</strong>: Microservices Engine </li>
         * <li><strong>22</strong>: File Storage NAS </li>
         * <li><strong>23</strong>: Data Security Center </li>
         * <li><strong>24</strong>: Elastic IP Address </li>
         * <li><strong>25</strong>: Cloud Identity Service - EIAM </li>
         * <li><strong>26</strong>: PolarDB-X </li>
         * <li><strong>27</strong>: Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Server vendor. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud Asset </li>
         * <li><strong>1</strong>: Non-cloud Asset </li>
         * <li><strong>2</strong>: IDC Asset </li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: Other Cloud Assets </li>
         * <li><strong>8</strong>: Lightweight Asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryRequestCloudAssetTypes build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryRequestCloudAssetTypes self = new GetCloudAssetSummaryRequestCloudAssetTypes();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryRequestCloudAssetTypes setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

}
