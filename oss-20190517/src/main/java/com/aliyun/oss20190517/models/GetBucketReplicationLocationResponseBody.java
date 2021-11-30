// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketReplicationLocationResponseBody extends TeaModel {
    @NameInMap("Location")
    public java.util.List<String> locations;

    @NameInMap("LocationTransferTypeConstraint")
    public GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint locationTransferTypeConstraint;

    public static GetBucketReplicationLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketReplicationLocationResponseBody self = new GetBucketReplicationLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketReplicationLocationResponseBody setLocations(java.util.List<String> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<String> getLocations() {
        return this.locations;
    }

    public GetBucketReplicationLocationResponseBody setLocationTransferTypeConstraint(GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint locationTransferTypeConstraint) {
        this.locationTransferTypeConstraint = locationTransferTypeConstraint;
        return this;
    }
    public GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint getLocationTransferTypeConstraint() {
        return this.locationTransferTypeConstraint;
    }

    public static class GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint extends TeaModel {
        @NameInMap("LocationTransferType")
        public java.util.List<LocationTransferType> locationTransferTypes;

        public static GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint build(java.util.Map<String, ?> map) throws Exception {
            GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint self = new GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint();
            return TeaModel.build(map, self);
        }

        public GetBucketReplicationLocationResponseBodyLocationTransferTypeConstraint setLocationTransferTypes(java.util.List<LocationTransferType> locationTransferTypes) {
            this.locationTransferTypes = locationTransferTypes;
            return this;
        }
        public java.util.List<LocationTransferType> getLocationTransferTypes() {
            return this.locationTransferTypes;
        }

    }

}
