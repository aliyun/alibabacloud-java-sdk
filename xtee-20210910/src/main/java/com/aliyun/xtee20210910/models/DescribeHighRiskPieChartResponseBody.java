// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHighRiskPieChartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeHighRiskPieChartResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeHighRiskPieChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHighRiskPieChartResponseBody self = new DescribeHighRiskPieChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHighRiskPieChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHighRiskPieChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeHighRiskPieChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHighRiskPieChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHighRiskPieChartResponseBody setResultObject(DescribeHighRiskPieChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeHighRiskPieChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeHighRiskPieChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid extends TeaModel {
        @NameInMap("show")
        public Boolean show;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("roseType")
        public String roseType;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries setData(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeriesData> getData() {
            return this.data;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries setRoseType(String roseType) {
            this.roseType = roseType;
            return this;
        }
        public String getRoseType() {
            return this.roseType;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity extends TeaModel {
        @NameInMap("animation")
        public Boolean animation;

        @NameInMap("grid")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid grid;

        @NameInMap("series")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries> series;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity setAnimation(Boolean animation) {
            this.animation = animation;
            return this;
        }
        public Boolean getAnimation() {
            return this.animation;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity setGrid(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid grid) {
            this.grid = grid;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCityGrid getGrid() {
            return this.grid;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity setSeries(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCitySeries> getSeries() {
            return this.series;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid extends TeaModel {
        @NameInMap("show")
        public Boolean show;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("roseType")
        public String roseType;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries setData(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeriesData> getData() {
            return this.data;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries setRoseType(String roseType) {
            this.roseType = roseType;
            return this;
        }
        public String getRoseType() {
            return this.roseType;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince extends TeaModel {
        @NameInMap("animation")
        public Boolean animation;

        @NameInMap("grid")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid grid;

        @NameInMap("series")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries> series;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince setAnimation(Boolean animation) {
            this.animation = animation;
            return this;
        }
        public Boolean getAnimation() {
            return this.animation;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince setGrid(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid grid) {
            this.grid = grid;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceGrid getGrid() {
            return this.grid;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince setSeries(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvinceSeries> getSeries() {
            return this.series;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid extends TeaModel {
        @NameInMap("show")
        public Boolean show;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("roseType")
        public String roseType;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries setData(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeriesData> getData() {
            return this.data;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries setRoseType(String roseType) {
            this.roseType = roseType;
            return this;
        }
        public String getRoseType() {
            return this.roseType;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity extends TeaModel {
        @NameInMap("animation")
        public Boolean animation;

        @NameInMap("grid")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid grid;

        @NameInMap("series")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries> series;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity setAnimation(Boolean animation) {
            this.animation = animation;
            return this;
        }
        public Boolean getAnimation() {
            return this.animation;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity setGrid(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid grid) {
            this.grid = grid;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCityGrid getGrid() {
            return this.grid;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity setSeries(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCitySeries> getSeries() {
            return this.series;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid extends TeaModel {
        @NameInMap("show")
        public Boolean show;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid setShow(Boolean show) {
            this.show = show;
            return this;
        }
        public Boolean getShow() {
            return this.show;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("roseType")
        public String roseType;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries setData(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeriesData> getData() {
            return this.data;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries setRoseType(String roseType) {
            this.roseType = roseType;
            return this;
        }
        public String getRoseType() {
            return this.roseType;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince extends TeaModel {
        @NameInMap("animation")
        public Boolean animation;

        @NameInMap("grid")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid grid;

        @NameInMap("series")
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries> series;

        public static DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince self = new DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince setAnimation(Boolean animation) {
            this.animation = animation;
            return this;
        }
        public Boolean getAnimation() {
            return this.animation;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince setGrid(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid grid) {
            this.grid = grid;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceGrid getGrid() {
            return this.grid;
        }

        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince setSeries(java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvinceSeries> getSeries() {
            return this.series;
        }

    }

    public static class DescribeHighRiskPieChartResponseBodyResultObject extends TeaModel {
        @NameInMap("highRiskIPCity")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity highRiskIPCity;

        @NameInMap("highRiskIPProvince")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince highRiskIPProvince;

        @NameInMap("highRiskMobileCity")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity highRiskMobileCity;

        @NameInMap("highRiskMobileProvince")
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince highRiskMobileProvince;

        public static DescribeHighRiskPieChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeHighRiskPieChartResponseBodyResultObject self = new DescribeHighRiskPieChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeHighRiskPieChartResponseBodyResultObject setHighRiskIPCity(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity highRiskIPCity) {
            this.highRiskIPCity = highRiskIPCity;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPCity getHighRiskIPCity() {
            return this.highRiskIPCity;
        }

        public DescribeHighRiskPieChartResponseBodyResultObject setHighRiskIPProvince(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince highRiskIPProvince) {
            this.highRiskIPProvince = highRiskIPProvince;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskIPProvince getHighRiskIPProvince() {
            return this.highRiskIPProvince;
        }

        public DescribeHighRiskPieChartResponseBodyResultObject setHighRiskMobileCity(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity highRiskMobileCity) {
            this.highRiskMobileCity = highRiskMobileCity;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileCity getHighRiskMobileCity() {
            return this.highRiskMobileCity;
        }

        public DescribeHighRiskPieChartResponseBodyResultObject setHighRiskMobileProvince(DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince highRiskMobileProvince) {
            this.highRiskMobileProvince = highRiskMobileProvince;
            return this;
        }
        public DescribeHighRiskPieChartResponseBodyResultObjectHighRiskMobileProvince getHighRiskMobileProvince() {
            return this.highRiskMobileProvince;
        }

    }

}
