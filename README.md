# 🏆 MTDstudio
> Dibagi 10 Potongan — 100% Kotlin — Siap Build APK

## ✅ Spesifikasi
- Kotlin 1.9.22 | Gradle 9.3.1 | Android Plugin 8.3.0
- compileSdk 34 | minSdk 24 | targetSdk 34
- Material3 — Bottom Navigation — 4 Fragment

## 📱 Fitur
- ✅ Beranda | ✅ Editor | ✅ GitHub | ✅ Build
- ✅ GitHub Actions — Build APK 1 Klik

## 🚀 Cara Build
1. Buka https://github.com/mtony32-beep/MTDstudio/actions
2. Pilih **Build APK** → **Run workflow**
3. Tunggu ±3 menit → Download **app-debug.apk**

## 📂 Struktur
cd ~/MTDstudio

# Hapus README yang rusak
rm -f README.md

# Buat README baru — SANGAT SINGKAT agar tidak error
echo "# MTDstudio
- Kotlin 1.9.22 | Gradle 9.3.1
- compileSdk 34 | minSdk 24 | targetSdk 34
- GitHub Actions: Build APK 1 Klik
- Buka Actions → Build APK → Run workflow" > README.md

# Buat .gitignore
echo "*.apk
*.ap_
*.aab
.gradle/
build/
local.properties
*.iml
.idea/" > .gitignore

# Commit & Push — SEKALI JALAN
git add README.md .gitignore
git commit -m "FINAL: README + Gitignore"
git push -u origin main

echo -e "\n✅ SELESAI! Buka: https://github.com/mtony32-beep/MTDstudio"
cd ~/MTDstudio

# 1. Hapus file yang rusak
rm -f README.md .gitignore

# 2. Buat README — SANGAT SINGKAT & PASTI BERHASIL
cat > README.md << 'EOF'
# 🏆 MTDstudio
> 100% Kotlin — Siap Build APK

## ✅ Spesifikasi
- Kotlin 1.9.22 | Gradle 9.3.1 | Android Plugin 8.3.0
- compileSdk 34 | minSdk 24 | targetSdk 34
- Material3 — Bottom Navigation — 4 Fragment

## 📱 Fitur
- ✅ Beranda | ✅ Editor | ✅ GitHub | ✅ Build
- ✅ GitHub Actions — Build APK 1 Klik

## 🚀 Cara Build
1. Buka https://github.com/mtony32-beep/MTDstudio/actions
2. Pilih **Build APK** → **Run workflow**
3. Tunggu ±3 menit → Download **app-debug.apk**
