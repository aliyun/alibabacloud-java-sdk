// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PermissionCondition extends TeaModel {
    @NameInMap("ip_equals")
    public PermissionConditionIpEquals ipEquals;

    @NameInMap("ip_not_equals")
    public PermissionConditionIpNotEquals ipNotEquals;

    @NameInMap("string_like")
    public PermissionConditionStringLike stringLike;

    @NameInMap("string_not_like")
    public PermissionConditionStringNotLike stringNotLike;

    public static PermissionCondition build(java.util.Map<String, ?> map) throws Exception {
        PermissionCondition self = new PermissionCondition();
        return TeaModel.build(map, self);
    }

    public PermissionCondition setIpEquals(PermissionConditionIpEquals ipEquals) {
        this.ipEquals = ipEquals;
        return this;
    }
    public PermissionConditionIpEquals getIpEquals() {
        return this.ipEquals;
    }

    public PermissionCondition setIpNotEquals(PermissionConditionIpNotEquals ipNotEquals) {
        this.ipNotEquals = ipNotEquals;
        return this;
    }
    public PermissionConditionIpNotEquals getIpNotEquals() {
        return this.ipNotEquals;
    }

    public PermissionCondition setStringLike(PermissionConditionStringLike stringLike) {
        this.stringLike = stringLike;
        return this;
    }
    public PermissionConditionStringLike getStringLike() {
        return this.stringLike;
    }

    public PermissionCondition setStringNotLike(PermissionConditionStringNotLike stringNotLike) {
        this.stringNotLike = stringNotLike;
        return this;
    }
    public PermissionConditionStringNotLike getStringNotLike() {
        return this.stringNotLike;
    }

    public static class PermissionConditionIpEquals extends TeaModel {
        @NameInMap("client_ip")
        public java.util.List<String> clientIp;

        public static PermissionConditionIpEquals build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionIpEquals self = new PermissionConditionIpEquals();
            return TeaModel.build(map, self);
        }

        public PermissionConditionIpEquals setClientIp(java.util.List<String> clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public java.util.List<String> getClientIp() {
            return this.clientIp;
        }

    }

    public static class PermissionConditionIpNotEquals extends TeaModel {
        @NameInMap("client_ip")
        public java.util.List<String> clientIp;

        public static PermissionConditionIpNotEquals build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionIpNotEquals self = new PermissionConditionIpNotEquals();
            return TeaModel.build(map, self);
        }

        public PermissionConditionIpNotEquals setClientIp(java.util.List<String> clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public java.util.List<String> getClientIp() {
            return this.clientIp;
        }

    }

    public static class PermissionConditionStringLike extends TeaModel {
        @NameInMap("vpc_id")
        public java.util.List<String> vpcId;

        public static PermissionConditionStringLike build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionStringLike self = new PermissionConditionStringLike();
            return TeaModel.build(map, self);
        }

        public PermissionConditionStringLike setVpcId(java.util.List<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public java.util.List<String> getVpcId() {
            return this.vpcId;
        }

    }

    public static class PermissionConditionStringNotLike extends TeaModel {
        @NameInMap("vpc_id")
        public java.util.List<String> vpcId;

        public static PermissionConditionStringNotLike build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionStringNotLike self = new PermissionConditionStringNotLike();
            return TeaModel.build(map, self);
        }

        public PermissionConditionStringNotLike setVpcId(java.util.List<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public java.util.List<String> getVpcId() {
            return this.vpcId;
        }

    }

}
