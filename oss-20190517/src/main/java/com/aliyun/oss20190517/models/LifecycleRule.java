// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LifecycleRule extends TeaModel {
    // 未完成分片上传的过期属性
    @NameInMap("AbortMultipartUpload")
    public LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload;

    // 过期属性
    @NameInMap("Expiration")
    public LifecycleExpiration lifecycleExpiration;

    // 规则标识
    @NameInMap("ID")
    public String ID;

    // 非当前版本生命周期规则的过期属性
    @NameInMap("NoncurrentVersionExpiration")
    public NoncurrentVersionExpiration noncurrentVersionExpiration;

    // 非当前版本生命周期规则的转储属性
    @NameInMap("NoncurrentVersionTransition")
    public java.util.List<NoncurrentVersionTransition> noncurrentVersionTransition;

    // 指定规则所适用的前缀
    @NameInMap("Prefix")
    public String prefix;

    // 规则的状态
    @NameInMap("Status")
    public String status;

    // 标签列表
    @NameInMap("Tag")
    public java.util.List<Tag> tag;

    // 存储类型转换
    @NameInMap("Transition")
    public java.util.List<LifecycleTransition> lifecycleTransition;

    public static LifecycleRule build(java.util.Map<String, ?> map) throws Exception {
        LifecycleRule self = new LifecycleRule();
        return TeaModel.build(map, self);
    }

    public LifecycleRule setLifecycleAbortMultipartUpload(LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload) {
        this.lifecycleAbortMultipartUpload = lifecycleAbortMultipartUpload;
        return this;
    }
    public LifecycleAbortMultipartUpload getLifecycleAbortMultipartUpload() {
        return this.lifecycleAbortMultipartUpload;
    }

    public LifecycleRule setLifecycleExpiration(LifecycleExpiration lifecycleExpiration) {
        this.lifecycleExpiration = lifecycleExpiration;
        return this;
    }
    public LifecycleExpiration getLifecycleExpiration() {
        return this.lifecycleExpiration;
    }

    public LifecycleRule setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public LifecycleRule setNoncurrentVersionExpiration(NoncurrentVersionExpiration noncurrentVersionExpiration) {
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        return this;
    }
    public NoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration;
    }

    public LifecycleRule setNoncurrentVersionTransition(java.util.List<NoncurrentVersionTransition> noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        return this;
    }
    public java.util.List<NoncurrentVersionTransition> getNoncurrentVersionTransition() {
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

    public LifecycleRule setTag(java.util.List<Tag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public LifecycleRule setLifecycleTransition(java.util.List<LifecycleTransition> lifecycleTransition) {
        this.lifecycleTransition = lifecycleTransition;
        return this;
    }
    public java.util.List<LifecycleTransition> getLifecycleTransition() {
        return this.lifecycleTransition;
    }

    public static class LifecycleAbortMultipartUpload extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        public static LifecycleAbortMultipartUpload build(java.util.Map<String, ?> map) throws Exception {
            LifecycleAbortMultipartUpload self = new LifecycleAbortMultipartUpload();
            return TeaModel.build(map, self);
        }

        public LifecycleAbortMultipartUpload setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleAbortMultipartUpload setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

    }

    public static class LifecycleExpiration extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        // 自动移除过期删除标记
        @NameInMap("ExpiredObjectDeleteMarker")
        public Boolean expiredObjectDeleteMarker;

        public static LifecycleExpiration build(java.util.Map<String, ?> map) throws Exception {
            LifecycleExpiration self = new LifecycleExpiration();
            return TeaModel.build(map, self);
        }

        public LifecycleExpiration setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleExpiration setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public LifecycleExpiration setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public Boolean getExpiredObjectDeleteMarker() {
            return this.expiredObjectDeleteMarker;
        }

    }

    public static class NoncurrentVersionExpiration extends TeaModel {
        // 天数
        @NameInMap("NoncurrentDays")
        public Integer noncurrentDays;

        public static NoncurrentVersionExpiration build(java.util.Map<String, ?> map) throws Exception {
            NoncurrentVersionExpiration self = new NoncurrentVersionExpiration();
            return TeaModel.build(map, self);
        }

        public NoncurrentVersionExpiration setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

    }

    public static class NoncurrentVersionTransition extends TeaModel {
        // 天数
        @NameInMap("NoncurrentDays")
        public Integer noncurrentDays;

        // 存储类型
        @NameInMap("StorageClass")
        public String storageClass;

        public static NoncurrentVersionTransition build(java.util.Map<String, ?> map) throws Exception {
            NoncurrentVersionTransition self = new NoncurrentVersionTransition();
            return TeaModel.build(map, self);
        }

        public NoncurrentVersionTransition setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

        public NoncurrentVersionTransition setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class Tag extends TeaModel {
        // 标签 key
        @NameInMap("Key")
        public String key;

        // 标签 value
        @NameInMap("Value")
        public String value;

        public static Tag build(java.util.Map<String, ?> map) throws Exception {
            Tag self = new Tag();
            return TeaModel.build(map, self);
        }

        public Tag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class LifecycleTransition extends TeaModel {
        // 日期
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        // 天数
        @NameInMap("Days")
        public Integer days;

        @NameInMap("StorageClass")
        public String storageClass;

        public static LifecycleTransition build(java.util.Map<String, ?> map) throws Exception {
            LifecycleTransition self = new LifecycleTransition();
            return TeaModel.build(map, self);
        }

        public LifecycleTransition setCreatedBeforeDate(String createdBeforeDate) {
            this.createdBeforeDate = createdBeforeDate;
            return this;
        }
        public String getCreatedBeforeDate() {
            return this.createdBeforeDate;
        }

        public LifecycleTransition setDays(Integer days) {
            this.days = days;
            return this;
        }
        public Integer getDays() {
            return this.days;
        }

        public LifecycleTransition setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

}
