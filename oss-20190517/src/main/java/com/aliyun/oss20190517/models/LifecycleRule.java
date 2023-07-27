// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class LifecycleRule extends TeaModel {
    @NameInMap("AbortMultipartUpload")
    public LifecycleAbortMultipartUpload lifecycleAbortMultipartUpload;

    @NameInMap("Expiration")
    public LifecycleExpiration lifecycleExpiration;

    @NameInMap("Filter")
    public Filter filter;

    @NameInMap("ID")
    public String ID;

    @NameInMap("NoncurrentVersionExpiration")
    public NoncurrentVersionExpiration noncurrentVersionExpiration;

    @NameInMap("NoncurrentVersionTransition")
    public java.util.List<NoncurrentVersionTransition> noncurrentVersionTransition;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<Tag> tag;

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

    public LifecycleRule setFilter(Filter filter) {
        this.filter = filter;
        return this;
    }
    public Filter getFilter() {
        return this.filter;
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
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

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
        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        @NameInMap("Days")
        public Integer days;

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

    public static class Not extends TeaModel {
        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Tag")
        public Tag tag;

        public static Not build(java.util.Map<String, ?> map) throws Exception {
            Not self = new Not();
            return TeaModel.build(map, self);
        }

        public Not setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public Not setTag(Tag tag) {
            this.tag = tag;
            return this;
        }
        public Tag getTag() {
            return this.tag;
        }

    }

    public static class Filter extends TeaModel {
        @NameInMap("Not")
        public Not not;

        public static Filter build(java.util.Map<String, ?> map) throws Exception {
            Filter self = new Filter();
            return TeaModel.build(map, self);
        }

        public Filter setNot(Not not) {
            this.not = not;
            return this;
        }
        public Not getNot() {
            return this.not;
        }

    }

    public static class NoncurrentVersionExpiration extends TeaModel {
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
        @NameInMap("AllowSmallFile")
        public Boolean allowSmallFile;

        @NameInMap("IsAccessTime")
        public Boolean isAccessTime;

        @NameInMap("NoncurrentDays")
        public Integer noncurrentDays;

        @NameInMap("ReturnToStdWhenVisit")
        public Boolean returnToStdWhenVisit;

        @NameInMap("StorageClass")
        public String storageClass;

        public static NoncurrentVersionTransition build(java.util.Map<String, ?> map) throws Exception {
            NoncurrentVersionTransition self = new NoncurrentVersionTransition();
            return TeaModel.build(map, self);
        }

        public NoncurrentVersionTransition setAllowSmallFile(Boolean allowSmallFile) {
            this.allowSmallFile = allowSmallFile;
            return this;
        }
        public Boolean getAllowSmallFile() {
            return this.allowSmallFile;
        }

        public NoncurrentVersionTransition setIsAccessTime(Boolean isAccessTime) {
            this.isAccessTime = isAccessTime;
            return this;
        }
        public Boolean getIsAccessTime() {
            return this.isAccessTime;
        }

        public NoncurrentVersionTransition setNoncurrentDays(Integer noncurrentDays) {
            this.noncurrentDays = noncurrentDays;
            return this;
        }
        public Integer getNoncurrentDays() {
            return this.noncurrentDays;
        }

        public NoncurrentVersionTransition setReturnToStdWhenVisit(Boolean returnToStdWhenVisit) {
            this.returnToStdWhenVisit = returnToStdWhenVisit;
            return this;
        }
        public Boolean getReturnToStdWhenVisit() {
            return this.returnToStdWhenVisit;
        }

        public NoncurrentVersionTransition setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

    }

    public static class LifecycleTransition extends TeaModel {
        @NameInMap("AllowSmallFile")
        public Boolean allowSmallFile;

        @NameInMap("CreatedBeforeDate")
        public String createdBeforeDate;

        @NameInMap("Days")
        public Integer days;

        @NameInMap("IsAccessTime")
        public Boolean isAccessTime;

        @NameInMap("ReturnToStdWhenVisit")
        public Boolean returnToStdWhenVisit;

        @NameInMap("StorageClass")
        public String storageClass;

        public static LifecycleTransition build(java.util.Map<String, ?> map) throws Exception {
            LifecycleTransition self = new LifecycleTransition();
            return TeaModel.build(map, self);
        }

        public LifecycleTransition setAllowSmallFile(Boolean allowSmallFile) {
            this.allowSmallFile = allowSmallFile;
            return this;
        }
        public Boolean getAllowSmallFile() {
            return this.allowSmallFile;
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

        public LifecycleTransition setIsAccessTime(Boolean isAccessTime) {
            this.isAccessTime = isAccessTime;
            return this;
        }
        public Boolean getIsAccessTime() {
            return this.isAccessTime;
        }

        public LifecycleTransition setReturnToStdWhenVisit(Boolean returnToStdWhenVisit) {
            this.returnToStdWhenVisit = returnToStdWhenVisit;
            return this;
        }
        public Boolean getReturnToStdWhenVisit() {
            return this.returnToStdWhenVisit;
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
