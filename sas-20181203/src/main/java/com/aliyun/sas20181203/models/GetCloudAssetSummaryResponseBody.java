// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCloudAssetSummaryResponseBody extends TeaModel {
    /**
     * <p>Summary information of cloud assets.</p>
     */
    @NameInMap("GroupedFields")
    public GetCloudAssetSummaryResponseBodyGroupedFields groupedFields;

    /**
     * <p>本次调用请求的ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAssetSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAssetSummaryResponseBody self = new GetCloudAssetSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAssetSummaryResponseBody setGroupedFields(GetCloudAssetSummaryResponseBodyGroupedFields groupedFields) {
        this.groupedFields = groupedFields;
        return this;
    }
    public GetCloudAssetSummaryResponseBodyGroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    public GetCloudAssetSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas extends TeaModel {
        /**
         * <p>Subtype of the cloud product</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <p>云产品的类型。取值：</p>
         * <ul>
         * <li><strong>0</strong>：云服务器 ECS</li>
         * <li><strong>1</strong>：负载均衡</li>
         * <li><strong>3</strong>：云数据库 RDS</li>
         * <li><strong>4</strong>：云数据库 MongoDB 版</li>
         * <li><strong>5</strong>：云数据库 Tair（兼容 Redis）</li>
         * <li><strong>6</strong>：容器镜像服务</li>
         * <li><strong>8</strong>：容器服务Kubernetes版</li>
         * <li><strong>9</strong>：专有网络VPC</li>
         * <li><strong>11</strong>：操作审计</li>
         * <li><strong>12</strong>：CDN</li>
         * <li><strong>13</strong>：数字证书管理服务（原SSL证书）</li>
         * <li><strong>14</strong>：云效</li>
         * <li><strong>15</strong>：访问控制</li>
         * <li><strong>16</strong>：DDoS防护</li>
         * <li><strong>17</strong>：Web应用防火墙</li>
         * <li><strong>18</strong>：对象存储</li>
         * <li><strong>19</strong>：云原生关系型数据库 PolarDB</li>
         * <li><strong>20</strong>：云数据库 PostgreSQL 版</li>
         * <li><strong>21</strong>：微服务引擎</li>
         * <li><strong>22</strong>：文件存储NAS</li>
         * <li><strong>23</strong>：数据安全中心</li>
         * <li><strong>24</strong>：弹性公网IP</li>
         * <li><strong>25</strong>：云身份服务-EIAM</li>
         * <li><strong>26</strong>：PolarDB-X</li>
         * <li><strong>27</strong>：Elasticsearch</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <p>Total number of this type of cloud product instances.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        /**
         * <p>Total number of risky instances for this type of cloud product.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("InstanceRiskCount")
        public Integer instanceRiskCount;

        /**
         * <p>服务器厂商。取值：</p>
         * <ul>
         * <li><strong>0</strong>：阿里云资产</li>
         * <li><strong>1</strong>：云外资产</li>
         * <li><strong>2</strong>：IDC资产</li>
         * <li><strong>3</strong>、<strong>4</strong>、<strong>5</strong>、<strong>7</strong>：其它云资产</li>
         * <li><strong>8</strong>：轻量级资产</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Vendor")
        public Integer vendor;

        public static GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas self = new GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setInstanceRiskCount(Integer instanceRiskCount) {
            this.instanceRiskCount = instanceRiskCount;
            return this;
        }
        public Integer getInstanceRiskCount() {
            return this.instanceRiskCount;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas setVendor(Integer vendor) {
            this.vendor = vendor;
            return this;
        }
        public Integer getVendor() {
            return this.vendor;
        }

    }

    public static class GetCloudAssetSummaryResponseBodyGroupedFields extends TeaModel {
        /**
         * <p>List of cloud product statistics</p>
         */
        @NameInMap("CloudAssetSummaryMetas")
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas;

        /**
         * <p>Total number of cloud product instances.</p>
         * 
         * <strong>example:</strong>
         * <p>919</p>
         */
        @NameInMap("InstanceCountTotal")
        public Integer instanceCountTotal;

        /**
         * <p>Total number of cloud product instances at risk</p>
         * 
         * <strong>example:</strong>
         * <p>544</p>
         */
        @NameInMap("InstanceRiskCountTotal")
        public Integer instanceRiskCountTotal;

        public static GetCloudAssetSummaryResponseBodyGroupedFields build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAssetSummaryResponseBodyGroupedFields self = new GetCloudAssetSummaryResponseBodyGroupedFields();
            return TeaModel.build(map, self);
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setCloudAssetSummaryMetas(java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> cloudAssetSummaryMetas) {
            this.cloudAssetSummaryMetas = cloudAssetSummaryMetas;
            return this;
        }
        public java.util.List<GetCloudAssetSummaryResponseBodyGroupedFieldsCloudAssetSummaryMetas> getCloudAssetSummaryMetas() {
            return this.cloudAssetSummaryMetas;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceCountTotal(Integer instanceCountTotal) {
            this.instanceCountTotal = instanceCountTotal;
            return this;
        }
        public Integer getInstanceCountTotal() {
            return this.instanceCountTotal;
        }

        public GetCloudAssetSummaryResponseBodyGroupedFields setInstanceRiskCountTotal(Integer instanceRiskCountTotal) {
            this.instanceRiskCountTotal = instanceRiskCountTotal;
            return this;
        }
        public Integer getInstanceRiskCountTotal() {
            return this.instanceRiskCountTotal;
        }

    }

}
