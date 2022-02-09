// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteOperatorPermissionResponseBody extends TeaModel {
    // 授权信息
    @NameInMap("OperatorPermission")
    public java.util.List<DeleteOperatorPermissionResponseBodyOperatorPermission> operatorPermission;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOperatorPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOperatorPermissionResponseBody self = new DeleteOperatorPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOperatorPermissionResponseBody setOperatorPermission(java.util.List<DeleteOperatorPermissionResponseBodyOperatorPermission> operatorPermission) {
        this.operatorPermission = operatorPermission;
        return this;
    }
    public java.util.List<DeleteOperatorPermissionResponseBodyOperatorPermission> getOperatorPermission() {
        return this.operatorPermission;
    }

    public DeleteOperatorPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteOperatorPermissionResponseBodyOperatorPermission extends TeaModel {
        // Oceanbase集群ID
        @NameInMap("InstanceId")
        public String instanceId;

        public static DeleteOperatorPermissionResponseBodyOperatorPermission build(java.util.Map<String, ?> map) throws Exception {
            DeleteOperatorPermissionResponseBodyOperatorPermission self = new DeleteOperatorPermissionResponseBodyOperatorPermission();
            return TeaModel.build(map, self);
        }

        public DeleteOperatorPermissionResponseBodyOperatorPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
