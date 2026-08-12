// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeResourceConstraintsResponseBody extends TeaModel {
    /**
     * <p>Details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public DescribeResourceConstraintsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error code. A value of <code>Success</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B67D142D-D54E-184F-A306-22BDC01B2XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeResourceConstraintsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceConstraintsResponseBody self = new DescribeResourceConstraintsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceConstraintsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeResourceConstraintsResponseBody setData(DescribeResourceConstraintsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeResourceConstraintsResponseBodyData getData() {
        return this.data;
    }

    public DescribeResourceConstraintsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeResourceConstraintsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeResourceConstraintsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeResourceConstraintsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceConstraintsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResourceConstraintsResponseBodyDataBeNumber extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataBeNumber build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataBeNumber self = new DescribeResourceConstraintsResponseBodyDataBeNumber();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataBeNumber set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public DescribeResourceConstraintsResponseBodyDataBeNumber setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataBeNumber setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataBeNumber setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The maximum number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum number of disks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint self = new DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint self = new DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataBeStorageConstraints extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>BE 存储约束描述</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The disk count constraint.</p>
         */
        @NameInMap("DiskNumberConstraint")
        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint diskNumberConstraint;

        /**
         * <p>Indicates whether this is the default option.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The disk performance level.</p>
         * 
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The value constraint.</p>
         */
        @NameInMap("ValueConstraint")
        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint valueConstraint;

        public static DescribeResourceConstraintsResponseBodyDataBeStorageConstraints build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataBeStorageConstraints self = new DescribeResourceConstraintsResponseBodyDataBeStorageConstraints();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraints setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraints setDiskNumberConstraint(DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint diskNumberConstraint) {
            this.diskNumberConstraint = diskNumberConstraint;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsDiskNumberConstraint getDiskNumberConstraint() {
            return this.diskNumberConstraint;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraints setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraints setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraints setValueConstraint(DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint valueConstraint) {
            this.valueConstraint = valueConstraint;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataBeStorageConstraintsValueConstraint getValueConstraint() {
            return this.valueConstraint;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The disk count.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DiskNumber")
        public String diskNumber;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>20核 88GiB 8*7300GiB 本地HDD盘</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The corresponding ECS instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.d2s.5xlarge</p>
         */
        @NameInMap("EcsInstanceType")
        public String ecsInstanceType;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>local_hdd_2s_5xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether this is the default option.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The memory size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The storage size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>7300</p>
         */
        @NameInMap("StorageSize")
        public String storageSize;

        public static DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints self = new DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setDiskNumber(String diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public String getDiskNumber() {
            return this.diskNumber;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setEcsInstanceType(String ecsInstanceType) {
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }
        public String getEcsInstanceType() {
            return this.ecsInstanceType;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataFeNumber extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataFeNumber build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataFeNumber self = new DescribeResourceConstraintsResponseBodyDataFeNumber();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataFeNumber set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public DescribeResourceConstraintsResponseBodyDataFeNumber setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataFeNumber setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataFeNumber setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataFeSpecType extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>标准版</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeResourceConstraintsResponseBodyDataFeSpecType build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataFeSpecType self = new DescribeResourceConstraintsResponseBodyDataFeSpecType();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataFeSpecType setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeResourceConstraintsResponseBodyDataFeSpecType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataFeStorage extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Max")
        public Integer max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataFeStorage build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataFeStorage self = new DescribeResourceConstraintsResponseBodyDataFeStorage();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataFeStorage set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public DescribeResourceConstraintsResponseBodyDataFeStorage setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataFeStorage setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataFeStorage setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec extends TeaModel {
        /**
         * <p>The CU (Compute Unit) size.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The total number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        /**
         * <p>The storage size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        public static DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec self = new DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The disk count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DiskNumber")
        public String diskNumber;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>[i2g]16核 64GiB 1*1788GiB 本地SSD盘</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The corresponding ECS instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.i2g.4xlarge</p>
         */
        @NameInMap("EcsInstanceType")
        public String ecsInstanceType;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>local_ssd_2g_4xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>Indicates whether this is the default option.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The memory size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The storage size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1788</p>
         */
        @NameInMap("StorageSize")
        public String storageSize;

        public static DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints self = new DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setDiskNumber(String diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public String getDiskNumber() {
            return this.diskNumber;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setEcsInstanceType(String ecsInstanceType) {
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }
        public String getEcsInstanceType() {
            return this.ecsInstanceType;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints setStorageSize(String storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public String getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec extends TeaModel {
        /**
         * <p>The CU (Compute Unit) size.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <p>The total number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NodeNumber")
        public Integer nodeNumber;

        /**
         * <p>The storage size, in GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        public static DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec self = new DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec setNodeNumber(Integer nodeNumber) {
            this.nodeNumber = nodeNumber;
            return this;
        }
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        public DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataSpecType extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>标准版</p>
         */
        @NameInMap("Display")
        public String display;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeResourceConstraintsResponseBodyDataSpecType build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataSpecType self = new DescribeResourceConstraintsResponseBodyDataSpecType();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataSpecType setDisplay(String display) {
            this.display = display;
            return this;
        }
        public String getDisplay() {
            return this.display;
        }

        public DescribeResourceConstraintsResponseBodyDataSpecType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataVersionConstraint extends TeaModel {
        /**
         * <p>The beta versions.</p>
         */
        @NameInMap("BetaVersions")
        public java.util.List<String> betaVersions;

        /**
         * <p>The default version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3</p>
         */
        @NameInMap("DefaultVersion")
        public String defaultVersion;

        /**
         * <p>The available versions.</p>
         */
        @NameInMap("Versions")
        public java.util.List<String> versions;

        public static DescribeResourceConstraintsResponseBodyDataVersionConstraint build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataVersionConstraint self = new DescribeResourceConstraintsResponseBodyDataVersionConstraint();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataVersionConstraint setBetaVersions(java.util.List<String> betaVersions) {
            this.betaVersions = betaVersions;
            return this;
        }
        public java.util.List<String> getBetaVersions() {
            return this.betaVersions;
        }

        public DescribeResourceConstraintsResponseBodyDataVersionConstraint setDefaultVersion(String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        public DescribeResourceConstraintsResponseBodyDataVersionConstraint setVersions(java.util.List<String> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<String> getVersions() {
            return this.versions;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("def")
        public Integer def;

        /**
         * <p>The maximum value.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("max")
        public Integer max;

        /**
         * <p>The minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("min")
        public Integer min;

        /**
         * <p>The step.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("step")
        public Integer step;

        public static DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint self = new DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint setDef(Integer def) {
            this.def = def;
            return this;
        }
        public Integer getDef() {
            return this.def;
        }

        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint setMax(Integer max) {
            this.max = max;
            return this;
        }
        public Integer getMax() {
            return this.max;
        }

        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint setMin(Integer min) {
            this.min = min;
            return this;
        }
        public Integer getMin() {
            return this.min;
        }

        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeResourceConstraintsResponseBodyData extends TeaModel {
        /**
         * <p>The CU sizes for agents.</p>
         */
        @NameInMap("AgentCu")
        public java.util.List<Integer> agentCu;

        /**
         * <p>The available CU (Compute Unit) sizes for BE nodes.</p>
         */
        @NameInMap("BeCu")
        public java.util.List<Integer> beCu;

        /**
         * <p>The CU sizes for BE nodes on ECS.</p>
         */
        @NameInMap("BeCuOnEcs")
        public java.util.List<Integer> beCuOnEcs;

        /**
         * <p>The BE node configuration.</p>
         */
        @NameInMap("BeNumber")
        public DescribeResourceConstraintsResponseBodyDataBeNumber beNumber;

        /**
         * <p>The storage constraints for BE nodes.</p>
         */
        @NameInMap("BeStorageConstraints")
        public java.util.List<DescribeResourceConstraintsResponseBodyDataBeStorageConstraints> beStorageConstraints;

        /**
         * <p>The specification constraints for big data instance types.</p>
         */
        @NameInMap("BigDataInstanceTypeConstraints")
        public java.util.List<DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints> bigDataInstanceTypeConstraints;

        /**
         * <p>The available CU sizes for FE nodes.</p>
         */
        @NameInMap("FeCu")
        public java.util.List<Integer> feCu;

        /**
         * <p>The CU sizes for FE nodes on ECS.</p>
         */
        @NameInMap("FeCuOnEcs")
        public java.util.List<Integer> feCuOnEcs;

        /**
         * <p>The number of FE nodes.</p>
         */
        @NameInMap("FeNumber")
        public DescribeResourceConstraintsResponseBodyDataFeNumber feNumber;

        /**
         * <p>The instance types for FE nodes.</p>
         */
        @NameInMap("FeSpecType")
        public java.util.List<DescribeResourceConstraintsResponseBodyDataFeSpecType> feSpecType;

        /**
         * <p>The storage size for the FE node.</p>
         */
        @NameInMap("FeStorage")
        public DescribeResourceConstraintsResponseBodyDataFeStorage feStorage;

        /**
         * <p>The high availability (HA) FE node configuration.</p>
         */
        @NameInMap("HaFeResourceSpec")
        public DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec haFeResourceSpec;

        /**
         * <p>The specification constraints for local SSD instance types.</p>
         */
        @NameInMap("LocalSSDInstanceTypeConstraints")
        public java.util.List<DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints> localSSDInstanceTypeConstraints;

        /**
         * <p>The standard FE resource configuration.</p>
         */
        @NameInMap("NormalFeResourceSpec")
        public DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec normalFeResourceSpec;

        /**
         * <p>The instance type for compute nodes. Valid values:</p>
         * <ul>
         * <li><p><code>standard</code>: Standard.</p>
         * </li>
         * <li><p><code>localSSD</code>: Local SSD.</p>
         * </li>
         * <li><p><code>bigData</code>: Large-capacity storage.</p>
         * </li>
         * <li><p><code>ramEnhanced</code>: Memory-enhanced.</p>
         * </li>
         * <li><p><code>networkEnhanced</code>: Network-enhanced.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public java.util.List<DescribeResourceConstraintsResponseBodyDataSpecType> specType;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>Deprecated.</p>
         */
        @NameInMap("SplitDiskThresholdMap")
        public java.util.Map<String, java.util.Map<String, ?>> splitDiskThresholdMap;

        /**
         * <p>The version constraint.</p>
         */
        @NameInMap("VersionConstraint")
        public DescribeResourceConstraintsResponseBodyDataVersionConstraint versionConstraint;

        /**
         * <p>The EED types supported in each availability zone.</p>
         */
        @NameInMap("ZoneSupportedEedTypes")
        public java.util.Map<String, java.util.List<String>> zoneSupportedEedTypes;

        /**
         * <p>The instance types supported in each availability zone.</p>
         */
        @NameInMap("ZoneSupportedSpecTypes")
        public java.util.Map<String, java.util.List<String>> zoneSupportedSpecTypes;

        /**
         * <p>The CU constraints for the compaction service.</p>
         */
        @NameInMap("compactionServiceCuConstraint")
        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint compactionServiceCuConstraint;

        /**
         * <p>The compaction services supported in each availability zone.</p>
         */
        @NameInMap("zoneSupportCompactionService")
        public java.util.Map<String, java.util.List<DataZoneSupportCompactionServiceValue>> zoneSupportCompactionService;

        public static DescribeResourceConstraintsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceConstraintsResponseBodyData self = new DescribeResourceConstraintsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeResourceConstraintsResponseBodyData setAgentCu(java.util.List<Integer> agentCu) {
            this.agentCu = agentCu;
            return this;
        }
        public java.util.List<Integer> getAgentCu() {
            return this.agentCu;
        }

        public DescribeResourceConstraintsResponseBodyData setBeCu(java.util.List<Integer> beCu) {
            this.beCu = beCu;
            return this;
        }
        public java.util.List<Integer> getBeCu() {
            return this.beCu;
        }

        public DescribeResourceConstraintsResponseBodyData setBeCuOnEcs(java.util.List<Integer> beCuOnEcs) {
            this.beCuOnEcs = beCuOnEcs;
            return this;
        }
        public java.util.List<Integer> getBeCuOnEcs() {
            return this.beCuOnEcs;
        }

        public DescribeResourceConstraintsResponseBodyData setBeNumber(DescribeResourceConstraintsResponseBodyDataBeNumber beNumber) {
            this.beNumber = beNumber;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataBeNumber getBeNumber() {
            return this.beNumber;
        }

        public DescribeResourceConstraintsResponseBodyData setBeStorageConstraints(java.util.List<DescribeResourceConstraintsResponseBodyDataBeStorageConstraints> beStorageConstraints) {
            this.beStorageConstraints = beStorageConstraints;
            return this;
        }
        public java.util.List<DescribeResourceConstraintsResponseBodyDataBeStorageConstraints> getBeStorageConstraints() {
            return this.beStorageConstraints;
        }

        public DescribeResourceConstraintsResponseBodyData setBigDataInstanceTypeConstraints(java.util.List<DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints> bigDataInstanceTypeConstraints) {
            this.bigDataInstanceTypeConstraints = bigDataInstanceTypeConstraints;
            return this;
        }
        public java.util.List<DescribeResourceConstraintsResponseBodyDataBigDataInstanceTypeConstraints> getBigDataInstanceTypeConstraints() {
            return this.bigDataInstanceTypeConstraints;
        }

        public DescribeResourceConstraintsResponseBodyData setFeCu(java.util.List<Integer> feCu) {
            this.feCu = feCu;
            return this;
        }
        public java.util.List<Integer> getFeCu() {
            return this.feCu;
        }

        public DescribeResourceConstraintsResponseBodyData setFeCuOnEcs(java.util.List<Integer> feCuOnEcs) {
            this.feCuOnEcs = feCuOnEcs;
            return this;
        }
        public java.util.List<Integer> getFeCuOnEcs() {
            return this.feCuOnEcs;
        }

        public DescribeResourceConstraintsResponseBodyData setFeNumber(DescribeResourceConstraintsResponseBodyDataFeNumber feNumber) {
            this.feNumber = feNumber;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataFeNumber getFeNumber() {
            return this.feNumber;
        }

        public DescribeResourceConstraintsResponseBodyData setFeSpecType(java.util.List<DescribeResourceConstraintsResponseBodyDataFeSpecType> feSpecType) {
            this.feSpecType = feSpecType;
            return this;
        }
        public java.util.List<DescribeResourceConstraintsResponseBodyDataFeSpecType> getFeSpecType() {
            return this.feSpecType;
        }

        public DescribeResourceConstraintsResponseBodyData setFeStorage(DescribeResourceConstraintsResponseBodyDataFeStorage feStorage) {
            this.feStorage = feStorage;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataFeStorage getFeStorage() {
            return this.feStorage;
        }

        public DescribeResourceConstraintsResponseBodyData setHaFeResourceSpec(DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec haFeResourceSpec) {
            this.haFeResourceSpec = haFeResourceSpec;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataHaFeResourceSpec getHaFeResourceSpec() {
            return this.haFeResourceSpec;
        }

        public DescribeResourceConstraintsResponseBodyData setLocalSSDInstanceTypeConstraints(java.util.List<DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints> localSSDInstanceTypeConstraints) {
            this.localSSDInstanceTypeConstraints = localSSDInstanceTypeConstraints;
            return this;
        }
        public java.util.List<DescribeResourceConstraintsResponseBodyDataLocalSSDInstanceTypeConstraints> getLocalSSDInstanceTypeConstraints() {
            return this.localSSDInstanceTypeConstraints;
        }

        public DescribeResourceConstraintsResponseBodyData setNormalFeResourceSpec(DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec normalFeResourceSpec) {
            this.normalFeResourceSpec = normalFeResourceSpec;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataNormalFeResourceSpec getNormalFeResourceSpec() {
            return this.normalFeResourceSpec;
        }

        public DescribeResourceConstraintsResponseBodyData setSpecType(java.util.List<DescribeResourceConstraintsResponseBodyDataSpecType> specType) {
            this.specType = specType;
            return this;
        }
        public java.util.List<DescribeResourceConstraintsResponseBodyDataSpecType> getSpecType() {
            return this.specType;
        }

        public DescribeResourceConstraintsResponseBodyData setSplitDiskThresholdMap(java.util.Map<String, java.util.Map<String, ?>> splitDiskThresholdMap) {
            this.splitDiskThresholdMap = splitDiskThresholdMap;
            return this;
        }
        public java.util.Map<String, java.util.Map<String, ?>> getSplitDiskThresholdMap() {
            return this.splitDiskThresholdMap;
        }

        public DescribeResourceConstraintsResponseBodyData setVersionConstraint(DescribeResourceConstraintsResponseBodyDataVersionConstraint versionConstraint) {
            this.versionConstraint = versionConstraint;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataVersionConstraint getVersionConstraint() {
            return this.versionConstraint;
        }

        public DescribeResourceConstraintsResponseBodyData setZoneSupportedEedTypes(java.util.Map<String, java.util.List<String>> zoneSupportedEedTypes) {
            this.zoneSupportedEedTypes = zoneSupportedEedTypes;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getZoneSupportedEedTypes() {
            return this.zoneSupportedEedTypes;
        }

        public DescribeResourceConstraintsResponseBodyData setZoneSupportedSpecTypes(java.util.Map<String, java.util.List<String>> zoneSupportedSpecTypes) {
            this.zoneSupportedSpecTypes = zoneSupportedSpecTypes;
            return this;
        }
        public java.util.Map<String, java.util.List<String>> getZoneSupportedSpecTypes() {
            return this.zoneSupportedSpecTypes;
        }

        public DescribeResourceConstraintsResponseBodyData setCompactionServiceCuConstraint(DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint compactionServiceCuConstraint) {
            this.compactionServiceCuConstraint = compactionServiceCuConstraint;
            return this;
        }
        public DescribeResourceConstraintsResponseBodyDataCompactionServiceCuConstraint getCompactionServiceCuConstraint() {
            return this.compactionServiceCuConstraint;
        }

        public DescribeResourceConstraintsResponseBodyData setZoneSupportCompactionService(java.util.Map<String, java.util.List<DataZoneSupportCompactionServiceValue>> zoneSupportCompactionService) {
            this.zoneSupportCompactionService = zoneSupportCompactionService;
            return this;
        }
        public java.util.Map<String, java.util.List<DataZoneSupportCompactionServiceValue>> getZoneSupportCompactionService() {
            return this.zoneSupportCompactionService;
        }

    }

}
