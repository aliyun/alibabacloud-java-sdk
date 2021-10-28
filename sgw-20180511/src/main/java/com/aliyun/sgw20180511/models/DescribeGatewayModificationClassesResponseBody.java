// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayModificationClassesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TargetGatewayClasses")
    public DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses targetGatewayClasses;

    public static DescribeGatewayModificationClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayModificationClassesResponseBody self = new DescribeGatewayModificationClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayModificationClassesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayModificationClassesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayModificationClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayModificationClassesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayModificationClassesResponseBody setTargetGatewayClasses(DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses targetGatewayClasses) {
        this.targetGatewayClasses = targetGatewayClasses;
        return this;
    }
    public DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses getTargetGatewayClasses() {
        return this.targetGatewayClasses;
    }

    public static class DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass extends TeaModel {
        @NameInMap("GatewayClass")
        public String gatewayClass;

        @NameInMap("IsAvailable")
        public Boolean isAvailable;

        public static DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass self = new DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass setGatewayClass(String gatewayClass) {
            this.gatewayClass = gatewayClass;
            return this;
        }
        public String getGatewayClass() {
            return this.gatewayClass;
        }

        public DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass setIsAvailable(Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

    }

    public static class DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses extends TeaModel {
        @NameInMap("TargetGatewayClass")
        public java.util.List<DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass> targetGatewayClass;

        public static DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses self = new DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayModificationClassesResponseBodyTargetGatewayClasses setTargetGatewayClass(java.util.List<DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass> targetGatewayClass) {
            this.targetGatewayClass = targetGatewayClass;
            return this;
        }
        public java.util.List<DescribeGatewayModificationClassesResponseBodyTargetGatewayClassesTargetGatewayClass> getTargetGatewayClass() {
            return this.targetGatewayClass;
        }

    }

}
