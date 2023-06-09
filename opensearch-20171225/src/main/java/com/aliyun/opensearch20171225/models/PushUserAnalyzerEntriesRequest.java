// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushUserAnalyzerEntriesRequest extends TeaModel {
    @NameInMap("entries")
    public java.util.List<PushUserAnalyzerEntriesRequestEntries> entries;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static PushUserAnalyzerEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUserAnalyzerEntriesRequest self = new PushUserAnalyzerEntriesRequest();
        return TeaModel.build(map, self);
    }

    public PushUserAnalyzerEntriesRequest setEntries(java.util.List<PushUserAnalyzerEntriesRequestEntries> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<PushUserAnalyzerEntriesRequestEntries> getEntries() {
        return this.entries;
    }

    public PushUserAnalyzerEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class PushUserAnalyzerEntriesRequestEntries extends TeaModel {
        @NameInMap("cmd")
        public String cmd;

        @NameInMap("key")
        public String key;

        @NameInMap("splitEnabled")
        public Boolean splitEnabled;

        @NameInMap("value")
        public String value;

        public static PushUserAnalyzerEntriesRequestEntries build(java.util.Map<String, ?> map) throws Exception {
            PushUserAnalyzerEntriesRequestEntries self = new PushUserAnalyzerEntriesRequestEntries();
            return TeaModel.build(map, self);
        }

        public PushUserAnalyzerEntriesRequestEntries setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public PushUserAnalyzerEntriesRequestEntries setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public PushUserAnalyzerEntriesRequestEntries setSplitEnabled(Boolean splitEnabled) {
            this.splitEnabled = splitEnabled;
            return this;
        }
        public Boolean getSplitEnabled() {
            return this.splitEnabled;
        }

        public PushUserAnalyzerEntriesRequestEntries setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
