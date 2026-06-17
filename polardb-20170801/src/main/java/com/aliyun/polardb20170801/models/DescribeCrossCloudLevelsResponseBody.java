// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCrossCloudLevelsResponseBody extends TeaModel {
    /**
     * <p>The list of supported cross-cloud specifications.</p>
     */
    @NameInMap("CrossCloudLevelList")
    public java.util.List<DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList> crossCloudLevelList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E56531A4-E552-40BA-9C58-137B80******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCrossCloudLevelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossCloudLevelsResponseBody self = new DescribeCrossCloudLevelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossCloudLevelsResponseBody setCrossCloudLevelList(java.util.List<DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList> crossCloudLevelList) {
        this.crossCloudLevelList = crossCloudLevelList;
        return this;
    }
    public java.util.List<DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList> getCrossCloudLevelList() {
        return this.crossCloudLevelList;
    }

    public DescribeCrossCloudLevelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList extends TeaModel {
        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DBType")
        public String DBType;

        /**
         * <p>The specification code.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.g4.medium.c</p>
         */
        @NameInMap("LevelCode")
        public String levelCode;

        /**
         * <p>The CPU and memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2 core 8 GB</p>
         */
        @NameInMap("LevelName")
        public String levelName;

        public static DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList self = new DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList setDBType(String DBType) {
            this.DBType = DBType;
            return this;
        }
        public String getDBType() {
            return this.DBType;
        }

        public DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList setLevelCode(String levelCode) {
            this.levelCode = levelCode;
            return this;
        }
        public String getLevelCode() {
            return this.levelCode;
        }

        public DescribeCrossCloudLevelsResponseBodyCrossCloudLevelList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

    }

}
