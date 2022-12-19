// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllImageBaselineResponseBody extends TeaModel {
    @NameInMap("ImageBaselines")
    public DescribeAllImageBaselineResponseBodyImageBaselines imageBaselines;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAllImageBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllImageBaselineResponseBody self = new DescribeAllImageBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllImageBaselineResponseBody setImageBaselines(DescribeAllImageBaselineResponseBodyImageBaselines imageBaselines) {
        this.imageBaselines = imageBaselines;
        return this;
    }
    public DescribeAllImageBaselineResponseBodyImageBaselines getImageBaselines() {
        return this.imageBaselines;
    }

    public DescribeAllImageBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("ClassKey")
        public String classKey;

        @NameInMap("ItemKey")
        public String itemKey;

        @NameInMap("NameKey")
        public String nameKey;

        public static DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList self = new DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList();
            return TeaModel.build(map, self);
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList setItemKey(String itemKey) {
            this.itemKey = itemKey;
            return this;
        }
        public String getItemKey() {
            return this.itemKey;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

    public static class DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BaselineItemList")
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList> baselineItemList;

        @NameInMap("ClassKey")
        public String classKey;

        @NameInMap("NameKey")
        public String nameKey;

        public static DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList self = new DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList();
            return TeaModel.build(map, self);
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList setBaselineItemList(java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList> baselineItemList) {
            this.baselineItemList = baselineItemList;
            return this;
        }
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameListBaselineItemList> getBaselineItemList() {
            return this.baselineItemList;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

    }

    public static class DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BaselineNameList")
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList> baselineNameList;

        @NameInMap("ClassKey")
        public String classKey;

        public static DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList self = new DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList();
            return TeaModel.build(map, self);
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList setBaselineNameList(java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList> baselineNameList) {
            this.baselineNameList = baselineNameList;
            return this;
        }
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassListBaselineNameList> getBaselineNameList() {
            return this.baselineNameList;
        }

        public DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

    }

    public static class DescribeAllImageBaselineResponseBodyImageBaselines extends TeaModel {
        @NameInMap("BaselineClassList")
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList> baselineClassList;

        public static DescribeAllImageBaselineResponseBodyImageBaselines build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllImageBaselineResponseBodyImageBaselines self = new DescribeAllImageBaselineResponseBodyImageBaselines();
            return TeaModel.build(map, self);
        }

        public DescribeAllImageBaselineResponseBodyImageBaselines setBaselineClassList(java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList> baselineClassList) {
            this.baselineClassList = baselineClassList;
            return this;
        }
        public java.util.List<DescribeAllImageBaselineResponseBodyImageBaselinesBaselineClassList> getBaselineClassList() {
            return this.baselineClassList;
        }

    }

}
