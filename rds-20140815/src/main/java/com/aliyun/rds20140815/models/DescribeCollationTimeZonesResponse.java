// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CollationTimeZones")
    @Validation(required = true)
    public DescribeCollationTimeZonesResponseCollationTimeZones collationTimeZones;

    public static DescribeCollationTimeZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesResponse self = new DescribeCollationTimeZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCollationTimeZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCollationTimeZonesResponse setCollationTimeZones(DescribeCollationTimeZonesResponseCollationTimeZones collationTimeZones) {
        this.collationTimeZones = collationTimeZones;
        return this;
    }
    public DescribeCollationTimeZonesResponseCollationTimeZones getCollationTimeZones() {
        return this.collationTimeZones;
    }

    public static class DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone extends TeaModel {
        @NameInMap("TimeZone")
        @Validation(required = true)
        public String timeZone;

        @NameInMap("StandardTimeOffset")
        @Validation(required = true)
        public String standardTimeOffset;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        public static DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone self = new DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone setStandardTimeOffset(String standardTimeOffset) {
            this.standardTimeOffset = standardTimeOffset;
            return this;
        }
        public String getStandardTimeOffset() {
            return this.standardTimeOffset;
        }

        public DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeCollationTimeZonesResponseCollationTimeZones extends TeaModel {
        @NameInMap("CollationTimeZone")
        @Validation(required = true)
        public java.util.List<DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone> collationTimeZone;

        public static DescribeCollationTimeZonesResponseCollationTimeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseCollationTimeZones self = new DescribeCollationTimeZonesResponseCollationTimeZones();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseCollationTimeZones setCollationTimeZone(java.util.List<DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone> collationTimeZone) {
            this.collationTimeZone = collationTimeZone;
            return this;
        }
        public java.util.List<DescribeCollationTimeZonesResponseCollationTimeZonesCollationTimeZone> getCollationTimeZone() {
            return this.collationTimeZone;
        }

    }

}
