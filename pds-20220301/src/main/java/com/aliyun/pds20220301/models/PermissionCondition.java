// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class PermissionCondition extends TeaModel {
    @NameInMap("bool_equals")
    public PermissionConditionBoolEquals boolEquals;

    @NameInMap("bool_not_equals")
    public PermissionConditionBoolNotEquals boolNotEquals;

    /**
     * <p>The IP address condition, which is true when the IP address is equal to one of the following lists.</p>
     */
    @NameInMap("ip_equals")
    public PermissionConditionIpEquals ipEquals;

    /**
     * <p>The IP address condition. This condition is true when the IP address is not equal to any of the following list.</p>
     */
    @NameInMap("ip_not_equals")
    public PermissionConditionIpNotEquals ipNotEquals;

    /**
     * <p>The string match condition, which is true when the string is equal to one of the following lists.</p>
     */
    @NameInMap("string_like")
    public PermissionConditionStringLike stringLike;

    /**
     * <p>The string match condition. This condition is true when the input string is not equal to any one of the following lists.</p>
     */
    @NameInMap("string_not_like")
    public PermissionConditionStringNotLike stringNotLike;

    public static PermissionCondition build(java.util.Map<String, ?> map) throws Exception {
        PermissionCondition self = new PermissionCondition();
        return TeaModel.build(map, self);
    }

    public PermissionCondition setBoolEquals(PermissionConditionBoolEquals boolEquals) {
        this.boolEquals = boolEquals;
        return this;
    }
    public PermissionConditionBoolEquals getBoolEquals() {
        return this.boolEquals;
    }

    public PermissionCondition setBoolNotEquals(PermissionConditionBoolNotEquals boolNotEquals) {
        this.boolNotEquals = boolNotEquals;
        return this;
    }
    public PermissionConditionBoolNotEquals getBoolNotEquals() {
        return this.boolNotEquals;
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

    public static class PermissionConditionBoolEquals extends TeaModel {
        @NameInMap("is_share_link")
        public Boolean isShareLink;

        public static PermissionConditionBoolEquals build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionBoolEquals self = new PermissionConditionBoolEquals();
            return TeaModel.build(map, self);
        }

        public PermissionConditionBoolEquals setIsShareLink(Boolean isShareLink) {
            this.isShareLink = isShareLink;
            return this;
        }
        public Boolean getIsShareLink() {
            return this.isShareLink;
        }

    }

    public static class PermissionConditionBoolNotEquals extends TeaModel {
        @NameInMap("is_share_link")
        public Boolean isShareLink;

        public static PermissionConditionBoolNotEquals build(java.util.Map<String, ?> map) throws Exception {
            PermissionConditionBoolNotEquals self = new PermissionConditionBoolNotEquals();
            return TeaModel.build(map, self);
        }

        public PermissionConditionBoolNotEquals setIsShareLink(Boolean isShareLink) {
            this.isShareLink = isShareLink;
            return this;
        }
        public Boolean getIsShareLink() {
            return this.isShareLink;
        }

    }

    public static class PermissionConditionIpEquals extends TeaModel {
        /**
         * <p>The IP address of the client.</p>
         */
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
        /**
         * <p>The IP address of the client.</p>
         */
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
        /**
         * <p>The vpcID of the client as a string match condition.</p>
         */
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
        /**
         * <p>The vpcID of the client as a string match condition.</p>
         */
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
