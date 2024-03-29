// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketInventoryResponseBody extends TeaModel {
    @NameInMap("Destination")
    public InventoryDestination destination;

    @NameInMap("Filter")
    public InventoryFilter filter;

    @NameInMap("Id")
    public String id;

    @NameInMap("IncludedObjectVersions")
    public String includedObjectVersions;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("OptionalFields")
    public OptionalFields optionalFields;

    @NameInMap("Schedule")
    public InventorySchedule schedule;

    public static GetBucketInventoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketInventoryResponseBody self = new GetBucketInventoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketInventoryResponseBody setDestination(InventoryDestination destination) {
        this.destination = destination;
        return this;
    }
    public InventoryDestination getDestination() {
        return this.destination;
    }

    public GetBucketInventoryResponseBody setFilter(InventoryFilter filter) {
        this.filter = filter;
        return this;
    }
    public InventoryFilter getFilter() {
        return this.filter;
    }

    public GetBucketInventoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetBucketInventoryResponseBody setIncludedObjectVersions(String includedObjectVersions) {
        this.includedObjectVersions = includedObjectVersions;
        return this;
    }
    public String getIncludedObjectVersions() {
        return this.includedObjectVersions;
    }

    public GetBucketInventoryResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public GetBucketInventoryResponseBody setOptionalFields(OptionalFields optionalFields) {
        this.optionalFields = optionalFields;
        return this;
    }
    public OptionalFields getOptionalFields() {
        return this.optionalFields;
    }

    public GetBucketInventoryResponseBody setSchedule(InventorySchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public InventorySchedule getSchedule() {
        return this.schedule;
    }

    public static class OptionalFields extends TeaModel {
        @NameInMap("Field")
        public java.util.List<String> field;

        public static OptionalFields build(java.util.Map<String, ?> map) throws Exception {
            OptionalFields self = new OptionalFields();
            return TeaModel.build(map, self);
        }

        public OptionalFields setField(java.util.List<String> field) {
            this.field = field;
            return this;
        }
        public java.util.List<String> getField() {
            return this.field;
        }

    }

}
