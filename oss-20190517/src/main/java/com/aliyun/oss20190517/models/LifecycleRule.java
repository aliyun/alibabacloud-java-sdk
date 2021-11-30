// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LifecycleRule extends TeaModel {
    // 未完成分片上传的过期属性
    @NameInMap("AbortMultipartUpload")
    public LifecycleRuleLifecycleAbortMultipartUpload lifecycleAbortMultipartUpload;

    // 过期属性
    @NameInMap("Expiration")
    public LifecycleRuleLifecycleExpiration lifecycleExpiration;

    // 规则标识
    @NameInMap("ID")
    public String ID;

    // 非当前版本生命周期规则的过期属性
    @NameInMap("NoncurrentVersionExpiration")
    public LifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration;

    // 非当前版本生命周期规则的转储属性
    @NameInMap("NoncurrentVersionTransition")
    public java.util.List<LifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition;

    // 指定规则所适用的前缀
    @NameInMap("Prefix")
    public String prefix;

    // 规则的状态
    @NameInMap("Status")
    public String status;

    // 标签列表
    @NameInMap("Tag")
    public java.util.List<LifecycleRuleTag> tag;

    // 存储类型转换
    @NameInMap("Transition")
    public java.util.List<LifecycleRuleLifecycleTransition> lifecycleTransition;

    public static LifecycleRule build(java.util.Map<String, ?> map) throws Exception {
        LifecycleRule self = new LifecycleRule();
        return TeaModel.build(map, self);
    }

    public LifecycleRule setLifecycleAbortMultipartUpload(LifecycleRuleLifecycleAbortMultipartUpload lifecycleAbortMultipartUpload) {
        this.lifecycleAbortMultipartUpload = lifecycleAbortMultipartUpload;
        return this;
    }
    public LifecycleRuleLifecycleAbortMultipartUpload getLifecycleAbortMultipartUpload() {
        return this.lifecycleAbortMultipartUpload;
    }

    public LifecycleRule setLifecycleExpiration(LifecycleRuleLifecycleExpiration lifecycleExpiration) {
        this.lifecycleExpiration = lifecycleExpiration;
        return this;
    }
    public LifecycleRuleLifecycleExpiration getLifecycleExpiration() {
        return this.lifecycleExpiration;
    }

    public LifecycleRule setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public LifecycleRule setNoncurrentVersionExpiration(LifecycleRuleNoncurrentVersionExpiration noncurrentVersionExpiration) {
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        return this;
    }
    public LifecycleRuleNoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration;
    }

    public LifecycleRule setNoncurrentVersionTransition(java.util.List<LifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        return this;
    }
    public java.util.List<LifecycleRuleNoncurrentVersionTransition> getNoncurrentVersionTransition() {
        return this.noncurrentVersionTransition;
    }

    public LifecycleRule setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public LifecycleRule setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public LifecycleRule setTag(java.util.List<LifecycleRuleTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<LifecycleRuleTag> getTag() {
        return this.tag;
    }

    public LifecycleRule setLifecycleTransition(java.util.List<LifecycleRuleLifecycleTransition> lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }
    public java.util.List<LifecycleRuleLifecycleTransition> getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    public static class LifecycleRuleLifecycleAbortMultipartUpload extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        public static LifecycleRuleLifecycleAbortMultipartUpload build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleLifecycleAbortMultipartUpload self = new LifecycleRuleLifecycleAbortMultipartUpload();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleLifecycleAbortMultipartUpload setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleRuleLifecycleAbortMultipartUpload setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

    }

    public static class LifecycleRuleLifecycleExpiration extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        // 自动移除过期删除标记
        @NameInMap("ExpiredObjectDeleteMarker")
        public Boolean expiredObjectDeleteMarker;

        public static LifecycleRuleLifecycleExpiration build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleLifecycleExpiration self = new LifecycleRuleLifecycleExpiration();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleLifecycleExpiration setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleRuleLifecycleExpiration setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public LifecycleRuleLifecycleExpiration setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public Boolean getExpiredObjectDeleteMarker() {
            return this.expiredObjectDeleteMarker;
        }

    }

    public static class LifecycleRuleNoncurrentVersionExpiration extends TeaModel {
        // 天数
        @NameInMap("NoncurrentDays")
        public Integer noncurrentDays;

        public static LifecycleRuleNoncurrentVersionExpiration build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleNoncurrentVersionExpiration self = new LifecycleRuleNoncurrentVersionExpiration();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleNoncurrentVersionExpiration setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

    }

    public static class LifecycleRuleNoncurrentVersionTransition extends TeaModel {
        // 天数
        @NameInMap("NoncurrentDays")
        public Integer noncurrentDays;

        // 存储类型
        @NameInMap("StorageClass")
        public String storageClass;

        public static LifecycleRuleNoncurrentVersionTransition build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleNoncurrentVersionTransition self = new LifecycleRuleNoncurrentVersionTransition();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleNoncurrentVersionTransition setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

        public LifecycleRuleNoncurrentVersionTransition setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class LifecycleRuleTag extends TeaModel {
        // 标签 key
        @NameInMap("Key")
        public String key;

        // 标签 value
        @NameInMap("Value")
        public String value;

        public static LifecycleRuleTag build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleTag self = new LifecycleRuleTag();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public LifecycleRuleTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class LifecycleRuleLifecycleTransition extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        @NameInMap("StorageClass")
        public String storageClass;

        public static LifecycleRuleLifecycleTransition build(java.util.Map<String, ?> map) throws Exception {
            LifecycleRuleLifecycleTransition self = new LifecycleRuleLifecycleTransition();
            return TeaModel.build(map, self);
        }

        public LifecycleRuleLifecycleTransition setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleRuleLifecycleTransition setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public LifecycleRuleLifecycleTransition setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

}
