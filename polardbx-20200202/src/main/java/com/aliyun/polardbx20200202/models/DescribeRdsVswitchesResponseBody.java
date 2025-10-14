// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeRdsVswitchesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeRdsVswitchesResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRdsVswitchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsVswitchesResponseBody self = new DescribeRdsVswitchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsVswitchesResponseBody setData(DescribeRdsVswitchesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRdsVswitchesResponseBodyData getData() {
        return this.data;
    }

    public DescribeRdsVswitchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRdsVswitchesResponseBodyDataVswitchList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>16378</p>
         */
        @NameInMap("AvailabeIpCount")
        public String availabeIpCount;

        /**
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <strong>example:</strong>
         * <p>describe</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>babac91eff704edf9bdccfaa6ba4efce</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>drdshbgae0han226</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("IzNo")
        public String izNo;

        /**
         * <strong>example:</strong>
         * <p>szt-backup</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>vpc id。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6lis7xmm****t9wrxb5</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeRdsVswitchesResponseBodyDataVswitchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVswitchesResponseBodyDataVswitchList self = new DescribeRdsVswitchesResponseBodyDataVswitchList();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setAvailabeIpCount(String availabeIpCount) {
            this.availabeIpCount = availabeIpCount;
            return this;
        }
        public String getAvailabeIpCount() {
            return this.availabeIpCount;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRdsVswitchesResponseBodyDataVswitchList setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeRdsVswitchesResponseBodyData extends TeaModel {
        @NameInMap("VswitchList")
        public java.util.List<DescribeRdsVswitchesResponseBodyDataVswitchList> vswitchList;

        public static DescribeRdsVswitchesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsVswitchesResponseBodyData self = new DescribeRdsVswitchesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRdsVswitchesResponseBodyData setVswitchList(java.util.List<DescribeRdsVswitchesResponseBodyDataVswitchList> vswitchList) {
            this.vswitchList = vswitchList;
            return this;
        }
        public java.util.List<DescribeRdsVswitchesResponseBodyDataVswitchList> getVswitchList() {
            return this.vswitchList;
        }

    }

}
