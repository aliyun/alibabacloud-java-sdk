// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCollationTimeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CollationTimeZones")
    public DescribeCollationTimeZonesResponseBodyCollationTimeZones collationTimeZones;

    public static DescribeCollationTimeZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCollationTimeZonesResponseBody self = new DescribeCollationTimeZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCollationTimeZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCollationTimeZonesResponseBody setCollationTimeZones(DescribeCollationTimeZonesResponseBodyCollationTimeZones collationTimeZones) {
        this.collationTimeZones = collationTimeZones;
        return this;
    }
    public DescribeCollationTimeZonesResponseBodyCollationTimeZones getCollationTimeZones() {
        return this.collationTimeZones;
    }

    public static class DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone extends TeaModel {
        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("StandardTimeOffset")
        public String standardTimeOffset;

        @NameInMap("Description")
        public String description;

        public static DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone self = new DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setStandardTimeOffset(String standardTimeOffset) {
            this.standardTimeOffset = standardTimeOffset;
            return this;
        }
        public String getStandardTimeOffset() {
            return this.standardTimeOffset;
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeCollationTimeZonesResponseBodyCollationTimeZones extends TeaModel {
        @NameInMap("CollationTimeZone")
        public java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> collationTimeZone;

        public static DescribeCollationTimeZonesResponseBodyCollationTimeZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeCollationTimeZonesResponseBodyCollationTimeZones self = new DescribeCollationTimeZonesResponseBodyCollationTimeZones();
            return TeaModel.build(map, self);
        }

        public DescribeCollationTimeZonesResponseBodyCollationTimeZones setCollationTimeZone(java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> collationTimeZone) {
            this.collationTimeZone = collationTimeZone;
            return this;
        }
        public java.util.List<DescribeCollationTimeZonesResponseBodyCollationTimeZonesCollationTimeZone> getCollationTimeZone() {
            return this.collationTimeZone;
        }

    }

}
