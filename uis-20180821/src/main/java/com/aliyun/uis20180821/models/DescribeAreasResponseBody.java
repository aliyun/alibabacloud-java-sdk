// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DescribeAreasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Areas")
    public DescribeAreasResponseBodyAreas areas;

    public static DescribeAreasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAreasResponseBody self = new DescribeAreasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAreasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAreasResponseBody setAreas(DescribeAreasResponseBodyAreas areas) {
        this.areas = areas;
        return this;
    }
    public DescribeAreasResponseBodyAreas getAreas() {
        return this.areas;
    }

    public static class DescribeAreasResponseBodyAreasArea extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("AreaId")
        public String areaId;

        public static DescribeAreasResponseBodyAreasArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeAreasResponseBodyAreasArea self = new DescribeAreasResponseBodyAreasArea();
            return TeaModel.build(map, self);
        }

        public DescribeAreasResponseBodyAreasArea setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeAreasResponseBodyAreasArea setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

    }

    public static class DescribeAreasResponseBodyAreas extends TeaModel {
        @NameInMap("Area")
        public java.util.List<DescribeAreasResponseBodyAreasArea> area;

        public static DescribeAreasResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            DescribeAreasResponseBodyAreas self = new DescribeAreasResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public DescribeAreasResponseBodyAreas setArea(java.util.List<DescribeAreasResponseBodyAreasArea> area) {
            this.area = area;
            return this;
        }
        public java.util.List<DescribeAreasResponseBodyAreasArea> getArea() {
            return this.area;
        }

    }

}
